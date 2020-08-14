package com.spring.advanced2.model;

import java.io.Serializable;

public class Advice {

    /**
     * slip : {"id":186,"advice":"One of the single best things about being an adult, is being able to buy as much LEGO as you want."}
     */

    private SlipBean slip;

    public SlipBean getSlip() {
        return slip;
    }

    public void setSlip(SlipBean slip) {
        this.slip = slip;
    }

    public static class SlipBean implements Serializable {
        /**
         * id : 186
         * advice : One of the single best things about being an adult, is being able to buy as much LEGO as you want.
         */

        private int id;
        private String advice;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAdvice() {
            return advice;
        }

        public void setAdvice(String advice) {
            this.advice = advice;
        }
    }
}
