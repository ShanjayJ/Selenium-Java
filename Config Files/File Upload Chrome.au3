WinWaitActive("Open")
ControlFocus("Open","","Edit1")
Sleep(1500)
ControlSetText("Open","","Edit1","C:\Users\shanj\Desktop\Shanjay\Shanjay_pic.jpg")
Sleep(2000)
ControlClick("Open","","Button1")