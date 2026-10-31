package org.insbaixcamp.ivanortegallistadecompradam2a.data.model

data class TicketItem(
    var id: Int,
    var name: String,
    var isCompleted: Boolean = false,
    var addedBy: String
)