package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

    public class Crime {

        private UUID mid;
        private String mTitle;
        private Date mDate;
        private boolean mSolved;


        public Crime(){
            mid = UUID.randomUUID();
            mDate = new Date();
        }

        public UUID getId() {
            return mid;
        }
        public String getTitle() {
            return mTitle;
        }
        public void setTitle(String title) {
            mTitle = title;
        }
        public  Date getDate (){
            return mDate;
        }
        public void setmDate(Date date) {
            mDate = date;
        }
        public boolean isSolved() {
            return mSolved;
        }
        public void setmSolved(boolean solved) {
            mSolved = solved;
        }

}

