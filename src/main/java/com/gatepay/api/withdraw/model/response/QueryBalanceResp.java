package com.gatepay.api.withdraw.model.response;

import com.gatepay.common.BaseResponse;


public class QueryBalanceResp extends BaseResponse<QueryBalanceResp> {

    private Details details;
    private Total total;  // 换算成目标币种的账户总额汇总


    private class Details {
        private Detail cross_margin;
        private Detail spot;
        private Detail finance;
        private Detail margin;
        private Detail quant;
        private Detail futures;
        private Detail delivery;
        private Detail warrant;
        private Detail cbbc;

        private class Detail {
            private String amount;  // 账户总额数字
            private String currency;  // 目标币种
            private String borrowed;  // 杠杆借贷总和（仅margin/cross_margin账户出现）
            private String unrealised_pnl;  // 未实现盈亏总和（仅futures/options/delivery/total账户出现）

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getBorrowed() {
                return borrowed;
            }

            public void setBorrowed(String borrowed) {
                this.borrowed = borrowed;
            }

            public String getUnrealised_pnl() {
                return unrealised_pnl;
            }

            public void setUnrealised_pnl(String unrealised_pnl) {
                this.unrealised_pnl = unrealised_pnl;
            }
        }

        public Detail getCross_margin() {
            return cross_margin;
        }

        public void setCross_margin(Detail cross_margin) {
            this.cross_margin = cross_margin;
        }

        public Detail getSpot() {
            return spot;
        }

        public void setSpot(Detail spot) {
            this.spot = spot;
        }

        public Detail getFinance() {
            return finance;
        }

        public void setFinance(Detail finance) {
            this.finance = finance;
        }

        public Detail getMargin() {
            return margin;
        }

        public void setMargin(Detail margin) {
            this.margin = margin;
        }

        public Detail getQuant() {
            return quant;
        }

        public void setQuant(Detail quant) {
            this.quant = quant;
        }

        public Detail getFutures() {
            return futures;
        }

        public void setFutures(Detail futures) {
            this.futures = futures;
        }

        public Detail getDelivery() {
            return delivery;
        }

        public void setDelivery(Detail delivery) {
            this.delivery = delivery;
        }

        public Detail getWarrant() {
            return warrant;
        }

        public void setWarrant(Detail warrant) {
            this.warrant = warrant;
        }

        public Detail getCbbc() {
            return cbbc;
        }

        public void setCbbc(Detail cbbc) {
            this.cbbc = cbbc;
        }
    }

    private class Total {
        private String currency;
        private String amount;
        private String unrealised_pnl;
        private String borrowed;

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getUnrealised_pnl() {
            return unrealised_pnl;
        }

        public void setUnrealised_pnl(String unrealised_pnl) {
            this.unrealised_pnl = unrealised_pnl;
        }

        public String getBorrowed() {
            return borrowed;
        }

        public void setBorrowed(String borrowed) {
            this.borrowed = borrowed;
        }
    }


    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

}
