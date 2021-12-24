package com.hfad.tictactoemvpapp;

public class Presenter implements IContract.IPresenter {
    IContract.IView myMVPView;
    IContract.IModel myMVPModel;

    public Presenter(IContract.IView myMVPView) {
        this.myMVPView = myMVPView;
        this.myMVPModel = new Model();
    }

    @Override
    public void someButtonWasClicked() {
        int someButton = myMVPModel.getIDButton(resID);
        myMVPView.getIDNumber(someButton);
    }
}
