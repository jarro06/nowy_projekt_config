 
listView('nowy_projekt Jobs') {
    description('nowy_projekt Jobs')
    jobs {
        regex('nowy_projekt_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
