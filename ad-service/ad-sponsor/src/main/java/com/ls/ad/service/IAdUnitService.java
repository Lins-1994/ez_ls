package com.ls.ad.service;

import com.ls.ad.exception.AdException;
import com.ls.ad.vo.AdUnitDistrictRequest;
import com.ls.ad.vo.AdUnitDistrictResponse;
import com.ls.ad.vo.AdUnitItRequest;
import com.ls.ad.vo.AdUnitItResponse;
import com.ls.ad.vo.AdUnitKeywordRequest;
import com.ls.ad.vo.AdUnitKeywordResponse;
import com.ls.ad.vo.AdUnitRequest;
import com.ls.ad.vo.AdUnitResponse;
import com.ls.ad.vo.CreativeUnitRequest;
import com.ls.ad.vo.CreativeUnitResponse;

/**
 * Created by Qinyi.
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
