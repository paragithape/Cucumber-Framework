Local $winId=WinWait("[CLASS:#32770]","",10)
ControlFocus($winId,"","Edit1")
Sleep(500)
ControlSetText($winId,"","Edit1","G:\Acceleration\FileOperations\Example1.txt")
Sleep(500)
ControlClick($winId,"","Button1")