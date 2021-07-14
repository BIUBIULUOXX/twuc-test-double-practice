
package mock;

public class MockDoorPanel extends DoorPanel{
    @Override
    void close() {
    }

    private Boolean Flag;


    public boolean isFlag(){
        Flag = Boolean.TRUE;
        return Flag;
    }
}
