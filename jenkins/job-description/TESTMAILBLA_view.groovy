 
listView('TESTMAILBLA Jobs') {
    description('TESTMAILBLA Jobs')
    jobs {
        regex('TESTMAILBLA_.+')
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
