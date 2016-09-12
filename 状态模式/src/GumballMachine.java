/**
 * Created by Administrator on 2016/9/9 0009.
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state ){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }


    public int getCount() {
        return count;
    }



//    final static int SOLD_OUT = 0;
//    final static int NO_QUARTER = 1;
//    final static int HAS_QUARTER = 2;
//    final static int SOLD = 3;
//
//    int State = SOLD_OUT;
//    int count = 0;
//
//    public GumballMachine(int count) {
//        this.count = count;
//        if (count > 0){
//            State = NO_QUARTER;
//        }
//    }
//
//    public void insertQuarter(){
//        if (State == HAS_QUARTER){
//            System.out.println("You can't insert another quarter");
//        }else if (State == NO_QUARTER){
//            State = HAS_QUARTER;
//            System.out.println();
//        }else if (State == SOLD_OUT){
//            System.out.println("You can't insert a quarter,the machine is sold out");
//        }else if (State == SOLD){
//            System.out.println("Please wait, we're already giving you a gumball");
//        }
//    }
//
//    public void ejectQuarter(){
//        if (State == HAS_QUARTER){
//            System.out.println("Quarter returned");
//            State = NO_QUARTER;
//        }else if (State == NO_QUARTER){
//            System.out.println("You haven't inserted a quarter");
//        }else if (State == SOLD_OUT){
//            System.out.println("Sorry, you already turned the crank");
//        }else if (State == SOLD){
//            System.out.println("You can't eject, you haven't inserted a quarter");
//        }
//    }
//
//    public void turnCrank(){
//        if (State == HAS_QUARTER){
//            System.out.println("You turned...");
//            State = SOLD;
//            dispense();
//        }else if (State == NO_QUARTER){
//            System.out.println("You turned but there's no quarter");
//        }else if (State == SOLD_OUT){
//            System.out.println("You turned but there's no gumballs");
//        }else if (State == SOLD){
//            System.out.println("Turning twice does't get you anther gumball!");
//            State = NO_QUARTER;
//        }
//    }
//
//    private void dispense() {
//        if (State == HAS_QUARTER){
//            System.out.println("No gumball dispense");
//        }else if (State == NO_QUARTER){
//            System.out.println("You need pay first");
//        }else if (State == SOLD_OUT){
//            System.out.println("No gumball dispense");
//        }else if (State == SOLD){
//            System.out.println("A gumball comes rolling out the slot");
//            count = count - 1;
//            if (count == 0){
//                System.out.println("Oops,out of gumballs!");
//                State = SOLD_OUT;
//            }else{
//                State = NO_QUARTER;
//            }
//        }
//    }


}
