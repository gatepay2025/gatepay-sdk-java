package com.gatepay.core.api.channelmanage;

import com.gatepay.core.api.channelmanage.model.CustomField;
import com.gatepay.core.api.channelmanage.model.MerchantChannel;
import com.gatepay.core.api.channelmanage.model.req.DeleteReq;
import com.gatepay.core.api.channelmanage.model.req.ListReq;
import com.gatepay.core.api.channelmanage.model.req.SaveReq;
import com.gatepay.core.api.channelmanage.model.req.UpdateReq;
import com.gatepay.common.GatePayConstants;
import com.gatepay.infrastructure.security.Credential;
import com.gatepay.infrastructure.GatePayConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class ApiChannelManageTest {

    private static ApiChannelManage apiChannelManage;


    @BeforeAll
    public static void init() {
        apiChannelManage = new ApiChannelManage(new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "mZ96D37oKk-HrWJc", new Credential("Mz6M_q4AkDnZCSoTDo03A6OtWzN5ut8_Uix3jyVjxAU=", "SkZlbKOqPoMwnxhl")));
    }


    @Test
    public void testSave() {
        CustomField customField = new CustomField();
        customField.setCode("87");
        customField.setName("Mike");
        customField.setValue("abc");
        MerchantChannel merchantChannel = new MerchantChannel();
        merchantChannel.setChannelId("44");
        merchantChannel.setDesc("velit");
        merchantChannel.setChannelType("0");
        merchantChannel.setChain("Lorem sed elit id aliqua");
        merchantChannel.setAddress("辽宁省 安乡县 芜湖县 幸路681号 93单元");
        merchantChannel.setCreateTime(1723004848459L);
        merchantChannel.setUpdateTime(1748005235155L);
        merchantChannel.setCustomFields(new CustomField[] { customField });
        SaveReq saveReq = new SaveReq();
        saveReq.setMerchantChannelList(new MerchantChannel[] { merchantChannel });
        apiChannelManage.save(saveReq);
    }

    @Test
    public void testList() {
        ListReq listReq = new ListReq();
        listReq.setChannelId("100");
        // listReq.setDesc("test list");
        // listReq.setChannelType("0");
        listReq.setPage(1);
        listReq.setCount(3);
        apiChannelManage.list(listReq);
    }

    @Test
    public void testUpdate() {
        CustomField customField = new CustomField();
        customField.setCode("87");
        customField.setName("Mike");
        customField.setValue("abc");
        MerchantChannel merchantChannel = new MerchantChannel();
        merchantChannel.setChannelId("44");
        // merchantChannel.setDesc("velit");
        // merchantChannel.setChannelType("0");
        // merchantChannel.setChain("Lorem sed elit id aliqua");
        // merchantChannel.setAddress("辽宁省 安乡县 芜湖县 幸路681号 93单元");
        // merchantChannel.setCreateTime(1723004848459L);
        // merchantChannel.setUpdateTime(1748005235155L);
        // merchantChannel.setCustomFields(new CustomField[] { customField });
        UpdateReq updateReq = new UpdateReq();
        updateReq.setMerchantChannelList(new MerchantChannel[] { merchantChannel });
        apiChannelManage.update(updateReq);
    }

    @Test
    public void testDelete() {
        DeleteReq deleteReq = new DeleteReq();
        deleteReq.setChannelId("100");
        apiChannelManage.delete(deleteReq);
    }

}
