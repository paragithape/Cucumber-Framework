;Welcome to file upload popup
;Enter window name
WinWaitActive("Open")
Sleep(500)
;Send file to upload
Send("G:\Acceleration\FileOperations\Example1.txt")
;Press TAB
Sleep(500)
Send("{TAB}")
Sleep(500)
Send("{TAB}")
Sleep(500)
;Press ENTER
Send("{ENTER}")