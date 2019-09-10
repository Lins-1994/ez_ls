package com.ls.ad.controller;

import com.alibaba.fastjson.JSON;
import com.ls.ad.annotation.IgnoreResponseAdvice;
import com.ls.ad.client.SponsorClient;
import com.ls.ad.client.vo.AdPlan;
import com.ls.ad.client.vo.AdPlanGetRequest;
import com.ls.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RestController
public class SearchController {

    private final RestTemplate restTemplate;

    private final SponsorClient sponsorClient;

    @Autowired
    public SearchController(RestTemplate restTemplate, SponsorClient sponsorClient) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }

    @IgnoreResponseAdvice
    @PostMapping("/getAdPlans")
    public CommonResponse<List<AdPlan>> getAdPlans(@RequestBody AdPlanGetRequest request){
        log.info("ad-search:getAdPlans -> {}", JSON.toJSONString(request));
        return sponsorClient.getAdPlan(request);
    }

    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("/getAdPlanByRibbon")
    public CommonResponse<List<AdPlan>> getAdPlanByRebbon(@RequestBody AdPlanGetRequest request){
        log.info("ad-search:getAdPlanByRibbon -> {}", JSON.toJSONString(request));
        return restTemplate.postForEntity("http://euraka-client-ad-sponsor/ad-sponsor/get/adPlan",request,CommonResponse.class).getBody();
    }
}
