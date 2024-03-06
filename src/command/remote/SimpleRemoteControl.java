package src.command.remote;

public class SimpleRemoteControl {
    //커맨드 객체 슬롯
    private Command slot;
    public SimpleRemoteControl(){}
    public void setCommand(Command _command){
        slot = _command;
    }
    //버튼 눌렸을 때 작동할 함수
    public void buttonWasPressed(){
        slot.execute();
    }

}
