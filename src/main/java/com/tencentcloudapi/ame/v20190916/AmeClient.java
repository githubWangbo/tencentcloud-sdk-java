/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ame.v20190916;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ame.v20190916.models.*;

public class AmeClient extends AbstractClient{
    private static String endpoint = "ame.tencentcloudapi.com";
    private static String service = "ame";
    private static String version = "2019-09-16";

    public AmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AmeClient(Credential credential, String region, ClientProfile profile) {
        super(AmeClient.endpoint, AmeClient.version, credential, region, profile);
    }

    /**
     *获取授权项目信息列表
     * @param req DescribeAuthInfoRequest
     * @return DescribeAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthInfoResponse DescribeAuthInfo(DescribeAuthInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuthInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuthInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuthInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云音乐播放信息接口
     * @param req DescribeCloudMusicRequest
     * @return DescribeCloudMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudMusicResponse DescribeCloudMusic(DescribeCloudMusicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudMusicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudMusicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudMusic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取授权项目下已购云音乐列表
     * @param req DescribeCloudMusicPurchasedRequest
     * @return DescribeCloudMusicPurchasedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudMusicPurchasedResponse DescribeCloudMusicPurchased(DescribeCloudMusicPurchasedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudMusicPurchasedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudMusicPurchasedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudMusicPurchased");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据歌曲ID查询歌曲信息
     * @param req DescribeItemByIdRequest
     * @return DescribeItemByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeItemByIdResponse DescribeItemById(DescribeItemByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeItemByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeItemByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeItemById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该服务后续会停用，不再建议使用
     * @param req DescribeItemsRequest
     * @return DescribeItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeItemsResponse DescribeItems(DescribeItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据 Id 查询歌曲的详细信息，包含基础信息及播放信息。
     * @param req DescribeKTVMusicDetailRequest
     * @return DescribeKTVMusicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVMusicDetailResponse DescribeKTVMusicDetail(DescribeKTVMusicDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVMusicDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVMusicDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVMusicDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据歌单 Id 获取歌单详情，包括歌单的基础信息以及歌曲列表。
     * @param req DescribeKTVPlaylistDetailRequest
     * @return DescribeKTVPlaylistDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVPlaylistDetailResponse DescribeKTVPlaylistDetail(DescribeKTVPlaylistDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVPlaylistDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVPlaylistDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVPlaylistDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播互动曲库推荐歌单列表。
     * @param req DescribeKTVPlaylistsRequest
     * @return DescribeKTVPlaylistsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVPlaylistsResponse DescribeKTVPlaylists(DescribeKTVPlaylistsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVPlaylistsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVPlaylistsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVPlaylists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据接口的模式及歌曲ID来取得歌词信息或者波形图信息。
     * @param req DescribeLyricRequest
     * @return DescribeLyricResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLyricResponse DescribeLyric(DescribeLyricRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLyricResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLyricResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLyric");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取曲库包歌曲播放信息接口
     * @param req DescribeMusicRequest
     * @return DescribeMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMusicResponse DescribeMusic(DescribeMusicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMusicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMusicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMusic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据音乐信息查询音乐是否在售
     * @param req DescribeMusicSaleStatusRequest
     * @return DescribeMusicSaleStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMusicSaleStatusResponse DescribeMusicSaleStatus(DescribeMusicSaleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMusicSaleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMusicSaleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMusicSaleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取曲库包下已核销歌曲列表接口
     * @param req DescribePackageItemsRequest
     * @return DescribePackageItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackageItemsResponse DescribePackageItems(DescribePackageItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackageItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackageItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePackageItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取已购曲库包列表接口
     * @param req DescribePackagesRequest
     * @return DescribePackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackagesResponse DescribePackages(DescribePackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据购买曲库包用户可查询已回退的歌曲信息
     * @param req DescribePkgOfflineMusicRequest
     * @return DescribePkgOfflineMusicResponse
     * @throws TencentCloudSDKException
     */
    public DescribePkgOfflineMusicResponse DescribePkgOfflineMusic(DescribePkgOfflineMusicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePkgOfflineMusicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePkgOfflineMusicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePkgOfflineMusic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该服务后续会停用，不再建议使用
     * @param req DescribeStationsRequest
     * @return DescribeStationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStationsResponse DescribeStations(DescribeStationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据资源方，需要变更的参数，请求该接口进行变更，为空的参数默认为无变更
     * @param req ModifyMusicOnShelvesRequest
     * @return ModifyMusicOnShelvesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMusicOnShelvesResponse ModifyMusicOnShelves(ModifyMusicOnShelvesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMusicOnShelvesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMusicOnShelvesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMusicOnShelves");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据资源方所传歌曲信息，进行歌曲上架，多个歌曲同时请求时，需构造复合结构进行请求
     * @param req PutMusicOnTheShelvesRequest
     * @return PutMusicOnTheShelvesResponse
     * @throws TencentCloudSDKException
     */
    public PutMusicOnTheShelvesResponse PutMusicOnTheShelves(PutMusicOnTheShelvesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutMusicOnTheShelvesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutMusicOnTheShelvesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutMusicOnTheShelves");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *客户上报用户数据功能，为了更好地为用户提供优质服务
     * @param req ReportDataRequest
     * @return ReportDataResponse
     * @throws TencentCloudSDKException
     */
    public ReportDataResponse ReportData(ReportDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReportDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据搜索条件，返回匹配的歌曲列表。
     * @param req SearchKTVMusicsRequest
     * @return SearchKTVMusicsResponse
     * @throws TencentCloudSDKException
     */
    public SearchKTVMusicsResponse SearchKTVMusics(SearchKTVMusicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchKTVMusicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchKTVMusicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchKTVMusics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据资源方所传MusicId进行将歌曲进行下架，多个MusicId使用逗号隔开
     * @param req TakeMusicOffShelvesRequest
     * @return TakeMusicOffShelvesResponse
     * @throws TencentCloudSDKException
     */
    public TakeMusicOffShelvesResponse TakeMusicOffShelves(TakeMusicOffShelvesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TakeMusicOffShelvesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TakeMusicOffShelvesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TakeMusicOffShelves");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
