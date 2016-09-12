package co.davo.reportcard;

/**
 * Created by Davo on 9/11/2016.
 */
public class ReportCard {
    private int mBiologyGrade;
    private int mPhysicsGrade;
    private int mComputerScienceGrade;
    private int mCalculusGrade;
    private int mEconomicsGrade;

    public ReportCard(int mBiologyGrade, int mPhysicsGrade, int mComputerScienceGrade, int mCalculusGrade, int mEconomicsGrade) {
        this.mBiologyGrade = mBiologyGrade;
        this.mPhysicsGrade = mPhysicsGrade;
        this.mComputerScienceGrade = mComputerScienceGrade;
        this.mCalculusGrade = mCalculusGrade;
        this.mEconomicsGrade = mEconomicsGrade;
    }

    public int getmBiologyGrade() {
        return mBiologyGrade;
    }

    public int getmPhysicsGrade() {
        return mPhysicsGrade;
    }

    public int getmComputerScienceGrade() {
        return mComputerScienceGrade;
    }

    public int getmCalculusGrade() {
        return mCalculusGrade;
    }

    public int getmEconomicsGrade() {
        return mEconomicsGrade;
    }

    public void setmBiologyGrade(int mBiologyGrade) {
        this.mBiologyGrade = mBiologyGrade;
    }

    public void setmPhysicsGrade(int mPhysicsGrade) {
        this.mPhysicsGrade = mPhysicsGrade;
    }

    public void setmComputerScienceGrade(int mComputerScienceGrade) {
        this.mComputerScienceGrade = mComputerScienceGrade;
    }

    public void setmCalculusGrade(int mCalculusGrade) {
        this.mCalculusGrade = mCalculusGrade;
    }

    public void setmEconomicsGrade(int mEconomicsGrade) {
        this.mEconomicsGrade = mEconomicsGrade;
    }

    @Override
    public String toString() {
        return "Report Card:" +
                "\n  Biology Grade: " + mBiologyGrade +
                "\n  Physics Grade: " + mPhysicsGrade +
                "\n  Computer Science Grade: " + mComputerScienceGrade +
                "\n  Calculus Grade: " + mCalculusGrade +
                "\n  Economics Grade: " + mEconomicsGrade;
    }
}
