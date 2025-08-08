/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.core.api.payment.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gatepay.common.BaseResponse;

/**
 * @Description 查询余额响应
 * @Author: ZJ-BE
 * @Date: 2025/07/25
 */
public class QueryBalanceResp extends BaseResponse<QueryBalanceResp> {

    @JsonProperty("ALGO")
    private String ALGO;

    @JsonProperty("APT")
    private String APT;

    @JsonProperty("ARB")
    private String ARB;

    @JsonProperty("ATOM")
    private String ATOM;

    @JsonProperty("AVAX")
    private String AVAX;

    @JsonProperty("BCH")
    private String BCH;

    @JsonProperty("BNB")
    private String BNB;

    @JsonProperty("BTC")
    private String BTC;

    @JsonProperty("CRO")
    private String CRO;

    @JsonProperty("DAI")
    private String DAI;

    @JsonProperty("DOGE")
    private String DOGE;

    @JsonProperty("EEG")
    private String EEG;

    @JsonProperty("ETC")
    private String ETC;

    @JsonProperty("ETH")
    private String ETH;

    @JsonProperty("FDUSD")
    private String FDUSD;

    @JsonProperty("FET")
    private String FET;

    @JsonProperty("HBAR")
    private String HBAR;

    @JsonProperty("ICP")
    private String ICP;

    @JsonProperty("KAS")
    private String KAS;

    @JsonProperty("LEO")
    private String LEO;

    @JsonProperty("LINK")
    private String LINK;

    @JsonProperty("LION")
    private String LION;

    @JsonProperty("MKR")
    private String MKR;

    @JsonProperty("MNT")
    private String MNT;

    @JsonProperty("NEAR")
    private String NEAR;

    @JsonProperty("PEPE")
    private String PEPE;

    @JsonProperty("POL")
    private String POL;

    @JsonProperty("PPIE")
    private String PPIE;

    @JsonProperty("RENDER")
    private String RENDER;

    @JsonProperty("SEPOLIA")
    private String SEPOLIA;

    @JsonProperty("SHIB")
    private String SHIB;

    @JsonProperty("SOL")
    private String SOL;

    @JsonProperty("STX")
    private String STX;

    @JsonProperty("TAO")
    private String TAO;

    @JsonProperty("TESTNET3")
    private String TESTNET3;

    @JsonProperty("TON")
    private String TON;

    @JsonProperty("TRX")
    private String TRX;

    @JsonProperty("UNI")
    private String UNI;

    @JsonProperty("USDC")
    private String USDC;

    @JsonProperty("USDT")
    private String USDT;

    @JsonProperty("VET")
    private String VET;

    @JsonProperty("XLM")
    private String XLM;

    @JsonProperty("XMR")
    private String XMR;


    public String getALGO() {
        return ALGO;
    }

    public void setALGO(String ALGO) {
        this.ALGO = ALGO;
    }

    public String getAPT() {
        return APT;
    }

    public void setAPT(String APT) {
        this.APT = APT;
    }

    public String getARB() {
        return ARB;
    }

    public void setARB(String ARB) {
        this.ARB = ARB;
    }

    public String getATOM() {
        return ATOM;
    }

    public void setATOM(String ATOM) {
        this.ATOM = ATOM;
    }

    public String getAVAX() {
        return AVAX;
    }

    public void setAVAX(String AVAX) {
        this.AVAX = AVAX;
    }

    public String getBCH() {
        return BCH;
    }

    public void setBCH(String BCH) {
        this.BCH = BCH;
    }

    public String getBNB() {
        return BNB;
    }

    public void setBNB(String BNB) {
        this.BNB = BNB;
    }

    public String getBTC() {
        return BTC;
    }

    public void setBTC(String BTC) {
        this.BTC = BTC;
    }

    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }

    public String getDAI() {
        return DAI;
    }

    public void setDAI(String DAI) {
        this.DAI = DAI;
    }

    public String getDOGE() {
        return DOGE;
    }

    public void setDOGE(String DOGE) {
        this.DOGE = DOGE;
    }

    public String getEEG() {
        return EEG;
    }

    public void setEEG(String EEG) {
        this.EEG = EEG;
    }

    public String getETC() {
        return ETC;
    }

    public void setETC(String ETC) {
        this.ETC = ETC;
    }

    public String getETH() {
        return ETH;
    }

    public void setETH(String ETH) {
        this.ETH = ETH;
    }

    public String getFDUSD() {
        return FDUSD;
    }

    public void setFDUSD(String FDUSD) {
        this.FDUSD = FDUSD;
    }

    public String getFET() {
        return FET;
    }

    public void setFET(String FET) {
        this.FET = FET;
    }

    public String getHBAR() {
        return HBAR;
    }

    public void setHBAR(String HBAR) {
        this.HBAR = HBAR;
    }

    public String getICP() {
        return ICP;
    }

    public void setICP(String ICP) {
        this.ICP = ICP;
    }

    public String getKAS() {
        return KAS;
    }

    public void setKAS(String KAS) {
        this.KAS = KAS;
    }

    public String getLEO() {
        return LEO;
    }

    public void setLEO(String LEO) {
        this.LEO = LEO;
    }

    public String getLINK() {
        return LINK;
    }

    public void setLINK(String LINK) {
        this.LINK = LINK;
    }

    public String getLION() {
        return LION;
    }

    public void setLION(String LION) {
        this.LION = LION;
    }

    public String getMKR() {
        return MKR;
    }

    public void setMKR(String MKR) {
        this.MKR = MKR;
    }

    public String getMNT() {
        return MNT;
    }

    public void setMNT(String MNT) {
        this.MNT = MNT;
    }

    public String getNEAR() {
        return NEAR;
    }

    public void setNEAR(String NEAR) {
        this.NEAR = NEAR;
    }

    public String getPEPE() {
        return PEPE;
    }

    public void setPEPE(String PEPE) {
        this.PEPE = PEPE;
    }

    public String getPOL() {
        return POL;
    }

    public void setPOL(String POL) {
        this.POL = POL;
    }

    public String getPPIE() {
        return PPIE;
    }

    public void setPPIE(String PPIE) {
        this.PPIE = PPIE;
    }

    public String getRENDER() {
        return RENDER;
    }

    public void setRENDER(String RENDER) {
        this.RENDER = RENDER;
    }

    public String getSEPOLIA() {
        return SEPOLIA;
    }

    public void setSEPOLIA(String SEPOLIA) {
        this.SEPOLIA = SEPOLIA;
    }

    public String getSHIB() {
        return SHIB;
    }

    public void setSHIB(String SHIB) {
        this.SHIB = SHIB;
    }

    public String getSOL() {
        return SOL;
    }

    public void setSOL(String SOL) {
        this.SOL = SOL;
    }

    public String getSTX() {
        return STX;
    }

    public void setSTX(String STX) {
        this.STX = STX;
    }

    public String getTAO() {
        return TAO;
    }

    public void setTAO(String TAO) {
        this.TAO = TAO;
    }

    public String getTESTNET3() {
        return TESTNET3;
    }

    public void setTESTNET3(String TESTNET3) {
        this.TESTNET3 = TESTNET3;
    }

    public String getTON() {
        return TON;
    }

    public void setTON(String TON) {
        this.TON = TON;
    }

    public String getTRX() {
        return TRX;
    }

    public void setTRX(String TRX) {
        this.TRX = TRX;
    }

    public String getUNI() {
        return UNI;
    }

    public void setUNI(String UNI) {
        this.UNI = UNI;
    }

    public String getUSDC() {
        return USDC;
    }

    public void setUSDC(String USDC) {
        this.USDC = USDC;
    }

    public String getUSDT() {
        return USDT;
    }

    public void setUSDT(String USDT) {
        this.USDT = USDT;
    }

    public String getVET() {
        return VET;
    }

    public void setVET(String VET) {
        this.VET = VET;
    }

    public String getXLM() {
        return XLM;
    }

    public void setXLM(String XLM) {
        this.XLM = XLM;
    }

    public String getXMR() {
        return XMR;
    }

    public void setXMR(String XMR) {
        this.XMR = XMR;
    }

}
