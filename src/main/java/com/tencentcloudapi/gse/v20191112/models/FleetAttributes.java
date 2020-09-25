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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetAttributes extends AbstractModel{

    /**
    * 生成包 Id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 创建服务器舰队时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 服务器舰队资源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetArn")
    @Expose
    private String FleetArn;

    /**
    * 服务器舰队 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 服务器舰队类型，目前只支持ON_DEMAND
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetType")
    @Expose
    private String FleetType;

    /**
    * 服务器类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 服务器舰队名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 游戏会话保护策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewGameServerSessionProtectionPolicy")
    @Expose
    private String NewGameServerSessionProtectionPolicy;

    /**
    * 操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatingSystem")
    @Expose
    private String OperatingSystem;

    /**
    * 资源创建限制策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceCreationLimitPolicy")
    @Expose
    private ResourceCreationLimitPolicy ResourceCreationLimitPolicy;

    /**
    * 状态：新建、下载中、验证中、生成中、激活中、活跃、异常、删除中、结束
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 服务器舰队停止状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppedActions")
    @Expose
    private String [] StoppedActions;

    /**
    * 服务器舰队终止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerminationTime")
    @Expose
    private String TerminationTime;

    /**
    * 时限保护时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameServerSessionProtectionTimeLimit")
    @Expose
    private Long GameServerSessionProtectionTimeLimit;

    /**
    * 计费状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingStatus")
    @Expose
    private String BillingStatus;

    /**
     * Get 生成包 Id 
     * @return AssetId 生成包 Id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 生成包 Id
     * @param AssetId 生成包 Id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 创建服务器舰队时间 
     * @return CreationTime 创建服务器舰队时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建服务器舰队时间
     * @param CreationTime 创建服务器舰队时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 服务器舰队资源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetArn 服务器舰队资源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetArn() {
        return this.FleetArn;
    }

    /**
     * Set 服务器舰队资源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetArn 服务器舰队资源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetArn(String FleetArn) {
        this.FleetArn = FleetArn;
    }

    /**
     * Get 服务器舰队 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 服务器舰队 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 服务器舰队 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 服务器舰队类型，目前只支持ON_DEMAND
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetType 服务器舰队类型，目前只支持ON_DEMAND
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetType() {
        return this.FleetType;
    }

    /**
     * Set 服务器舰队类型，目前只支持ON_DEMAND
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetType 服务器舰队类型，目前只支持ON_DEMAND
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetType(String FleetType) {
        this.FleetType = FleetType;
    }

    /**
     * Get 服务器类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 服务器类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 服务器类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 服务器类型，例如S5.LARGE8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 服务器舰队名称 
     * @return Name 服务器舰队名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务器舰队名称
     * @param Name 服务器舰队名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 游戏会话保护策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewGameServerSessionProtectionPolicy 游戏会话保护策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewGameServerSessionProtectionPolicy() {
        return this.NewGameServerSessionProtectionPolicy;
    }

    /**
     * Set 游戏会话保护策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewGameServerSessionProtectionPolicy 游戏会话保护策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewGameServerSessionProtectionPolicy(String NewGameServerSessionProtectionPolicy) {
        this.NewGameServerSessionProtectionPolicy = NewGameServerSessionProtectionPolicy;
    }

    /**
     * Get 操作系统类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatingSystem 操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    /**
     * Set 操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatingSystem 操作系统类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    /**
     * Get 资源创建限制策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceCreationLimitPolicy 资源创建限制策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.ResourceCreationLimitPolicy;
    }

    /**
     * Set 资源创建限制策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceCreationLimitPolicy 资源创建限制策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy ResourceCreationLimitPolicy) {
        this.ResourceCreationLimitPolicy = ResourceCreationLimitPolicy;
    }

    /**
     * Get 状态：新建、下载中、验证中、生成中、激活中、活跃、异常、删除中、结束
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态：新建、下载中、验证中、生成中、激活中、活跃、异常、删除中、结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：新建、下载中、验证中、生成中、激活中、活跃、异常、删除中、结束
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态：新建、下载中、验证中、生成中、激活中、活跃、异常、删除中、结束
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 服务器舰队停止状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppedActions 服务器舰队停止状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStoppedActions() {
        return this.StoppedActions;
    }

    /**
     * Set 服务器舰队停止状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppedActions 服务器舰队停止状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppedActions(String [] StoppedActions) {
        this.StoppedActions = StoppedActions;
    }

    /**
     * Get 服务器舰队终止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerminationTime 服务器舰队终止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTerminationTime() {
        return this.TerminationTime;
    }

    /**
     * Set 服务器舰队终止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerminationTime 服务器舰队终止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminationTime(String TerminationTime) {
        this.TerminationTime = TerminationTime;
    }

    /**
     * Get 时限保护时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameServerSessionProtectionTimeLimit 时限保护时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGameServerSessionProtectionTimeLimit() {
        return this.GameServerSessionProtectionTimeLimit;
    }

    /**
     * Set 时限保护时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameServerSessionProtectionTimeLimit 时限保护时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameServerSessionProtectionTimeLimit(Long GameServerSessionProtectionTimeLimit) {
        this.GameServerSessionProtectionTimeLimit = GameServerSessionProtectionTimeLimit;
    }

    /**
     * Get 计费状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingStatus 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingStatus() {
        return this.BillingStatus;
    }

    /**
     * Set 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingStatus 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingStatus(String BillingStatus) {
        this.BillingStatus = BillingStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FleetArn", this.FleetArn);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "FleetType", this.FleetType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NewGameServerSessionProtectionPolicy", this.NewGameServerSessionProtectionPolicy);
        this.setParamSimple(map, prefix + "OperatingSystem", this.OperatingSystem);
        this.setParamObj(map, prefix + "ResourceCreationLimitPolicy.", this.ResourceCreationLimitPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "StoppedActions.", this.StoppedActions);
        this.setParamSimple(map, prefix + "TerminationTime", this.TerminationTime);
        this.setParamSimple(map, prefix + "GameServerSessionProtectionTimeLimit", this.GameServerSessionProtectionTimeLimit);
        this.setParamSimple(map, prefix + "BillingStatus", this.BillingStatus);

    }
}

