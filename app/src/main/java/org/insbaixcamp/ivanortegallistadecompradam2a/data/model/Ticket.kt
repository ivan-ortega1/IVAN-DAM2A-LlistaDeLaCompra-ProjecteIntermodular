package org.insbaixcamp.ivanortegallistadecompradam2a.data.model

data class Ticket(
    var id: Int,
    var title: String,
    var createdBy: String,
    var creatorEmail: String,
    var createdAt: Long = System.currentTimeMillis(),
    var items: List<TicketItem> = emptyList()
)

fun getFakeTickets(): List<Ticket> {
    return listOf<Ticket>(
        Ticket(1, "Ticket 1", "User 1", "william.henry.moody@my-own-personal-domain.com", 1623456789,
            listOf(
            TicketItem(1, "Item 1", false, "User 1"),
            TicketItem(2, "Item 2", false, "User 1"),
            TicketItem(3, "Item 3", false, "User 1")
        )),
        Ticket(2, "Ticket 2", "User 2", "james.wilson@example-pet-store.com", 1623456789,
            listOf(
                TicketItem(1, "Item 1", false, "User 2"),
                TicketItem(2, "Item 2", false, "User 2"),
                TicketItem(3, "Item 3", false, "User 2")
            )),
        Ticket(3, "Ticket 3", "User 3", "john.mclean@examplepetstore.com", 1623456789,
            listOf(
                TicketItem(1, "Item 1", false, "User 3"),
                TicketItem(2, "Item 2", false, "User 3"),
                TicketItem(3, "Item 3", false, "User 3")
            )),
        Ticket(4, "Ticket 4", "User 4", "john.mclean@examplepetstore.com", 1623456789,
            listOf(
                TicketItem(1, "Item 1", false, "User 4"),
                TicketItem(2, "Item 2", false, "User 4"),
                TicketItem(3, "Item 3", false, "User 4")
            )))
}
