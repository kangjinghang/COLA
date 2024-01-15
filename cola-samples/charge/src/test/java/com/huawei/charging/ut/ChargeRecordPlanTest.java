package com.huawei.charging.ut;


import com.huawei.charging.domain.charge.chargeplan.BasicChargePlan;
import com.huawei.charging.domain.charge.chargeplan.ChargePlan;
import com.huawei.charging.domain.charge.chargeplan.ChargePlanType;
import com.huawei.charging.domain.charge.chargeplan.FamilyChargePlan;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChargeRecordPlanTest {

    @Test
    public void test_priority(){
        ChargePlan basicChargePlan = new BasicChargePlan();
        ChargePlan familyChargePlan = new FamilyChargePlan();
        ChargePlan fixedTimeChargePlan = new FamilyChargePlan();
        List<ChargePlan> chargePlanList =  new ArrayList<>();
        chargePlanList.add(basicChargePlan);
        chargePlanList.add(familyChargePlan);
        chargePlanList.add(fixedTimeChargePlan);

        Collections.sort(chargePlanList);

        System.out.println(chargePlanList.get(0));
        Assert.assertEquals(ChargePlanType.FAMILY, chargePlanList.get(0).getType());

    }
}
