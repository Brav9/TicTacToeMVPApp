package com.hfad.tictactoemvpapp;

public interface IContract {

    interface IView {

        void  getIDNumber(int someButton);
    }

    interface IPresenter {
        void someButtonWasClicked();
    }

    interface IModel {
        int getIDButton(int resID);

        void getIDNumber();
    }
}
