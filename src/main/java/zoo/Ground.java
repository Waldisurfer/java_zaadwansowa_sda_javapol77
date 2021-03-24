package zoo;

public class Ground{
    void runOnGround(RunBehavior runBehavior, double speed) {
        System.out.println(runBehavior.toString() + " biega po ziemi, z predkoscia ");
        runBehavior.run(speed);
    }
}
