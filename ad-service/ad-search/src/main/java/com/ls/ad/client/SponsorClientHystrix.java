package com.ls.ad.client;

import com.ls.ad.client.vo.AdPlan;
import com.ls.ad.client.vo.AdPlanGetRequest;
import com.ls.ad.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient(value = "eureka-client-ad-sponsor", fallback = SponsorClient.class)
public class SponsorClientHystrix implements SponsorClient {
    @Override
    public CommonResponse<List<AdPlan>> getAdPlan(AdPlanGetRequest request) {
        return new CommonResponse<>(-1,"eureka-client-ad-sponsor error");
    }
}
