package co.edu.unicauca.calendarweekview.models

import android.util.EventLog.Event
import java.text.SimpleDateFormat
import java.util.*

data class MyEvent(
    val id: Long,
    val title: String,
    val startTime: Calendar,
    val endTime: Calendar,
){
    companion object{
        var events : MutableList<MyEvent> = mutableListOf()
            get() = mutableListOf(
                MyEvent(
                    1,
                    "evento 1",
                    toCalendar("2022-12-12T09:00"),
                    toCalendar("2022-12-12T10:00")
                ),
                MyEvent(
                    2,
                    "evento 2",
                    toCalendar("2022-12-13T11:00"),
                    toCalendar("2022-12-13T13:00")
                ),
                MyEvent(
                    3,
                    "evento 3",
                    toCalendar("2022-12-15T14:00"),
                    toCalendar("2022-12-15T15:00")
                ),
                MyEvent(
                    4,
                    "evento 4",
                    toCalendar("2022-11-17T08:00"),
                    toCalendar("2022-11-17T09:00")
                ),
                MyEvent(
                    5,
                    "evento 5",
                    toCalendar("2022-11-16T09:00"),
                    toCalendar("2022-11-16T10:00")
                )
            )

        fun addEvent(event: MyEvent): MutableList<MyEvent>{
            events.add(event)
            return events
        }

    }
}

fun toCalendar(date: String): Calendar {
    var formatter: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm")
    var datoss : Date = formatter.parse(date);
    val cal = Calendar.getInstance()
    cal.time = datoss
    println("formato: "+cal.time);
    return cal
}
