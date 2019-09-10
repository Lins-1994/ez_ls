package com.ls.ad.service;

import com.ls.ad.vo.CreativeRequest;
import com.ls.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
