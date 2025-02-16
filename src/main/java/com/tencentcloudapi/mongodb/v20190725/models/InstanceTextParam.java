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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTextParam extends AbstractModel{

    /**
    * 当前值(暂未使用)
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 默认值(暂未使用)
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 是否需要重启(暂未使用)
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * 参数名称(暂未使用)
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * text类型值(暂未使用)
    */
    @SerializedName("TextValue")
    @Expose
    private String TextValue;

    /**
    * 说明(暂未使用)
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * 值类型(暂未使用)
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 值获取状态(暂未使用)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 当前值(暂未使用) 
     * @return CurrentValue 当前值(暂未使用)
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 当前值(暂未使用)
     * @param CurrentValue 当前值(暂未使用)
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 默认值(暂未使用) 
     * @return DefaultValue 默认值(暂未使用)
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值(暂未使用)
     * @param DefaultValue 默认值(暂未使用)
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 是否需要重启(暂未使用) 
     * @return NeedRestart 是否需要重启(暂未使用)
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 是否需要重启(暂未使用)
     * @param NeedRestart 是否需要重启(暂未使用)
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 参数名称(暂未使用) 
     * @return ParamName 参数名称(暂未使用)
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称(暂未使用)
     * @param ParamName 参数名称(暂未使用)
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get text类型值(暂未使用) 
     * @return TextValue text类型值(暂未使用)
     */
    public String getTextValue() {
        return this.TextValue;
    }

    /**
     * Set text类型值(暂未使用)
     * @param TextValue text类型值(暂未使用)
     */
    public void setTextValue(String TextValue) {
        this.TextValue = TextValue;
    }

    /**
     * Get 说明(暂未使用) 
     * @return Tips 说明(暂未使用)
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set 说明(暂未使用)
     * @param Tips 说明(暂未使用)
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 值类型(暂未使用) 
     * @return ValueType 值类型(暂未使用)
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 值类型(暂未使用)
     * @param ValueType 值类型(暂未使用)
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 值获取状态(暂未使用) 
     * @return Status 值获取状态(暂未使用)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 值获取状态(暂未使用)
     * @param Status 值获取状态(暂未使用)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public InstanceTextParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTextParam(InstanceTextParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.TextValue != null) {
            this.TextValue = new String(source.TextValue);
        }
        if (source.Tips != null) {
            this.Tips = new String[source.Tips.length];
            for (int i = 0; i < source.Tips.length; i++) {
                this.Tips[i] = new String(source.Tips[i]);
            }
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "TextValue", this.TextValue);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

