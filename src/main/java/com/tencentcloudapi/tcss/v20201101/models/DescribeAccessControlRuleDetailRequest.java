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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessControlRuleDetailRequest extends AbstractModel{

    /**
    * 策略唯一id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 镜像id, 仅仅在事件加白的时候使用
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get 策略唯一id 
     * @return RuleId 策略唯一id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 策略唯一id
     * @param RuleId 策略唯一id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 镜像id, 仅仅在事件加白的时候使用 
     * @return ImageId 镜像id, 仅仅在事件加白的时候使用
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id, 仅仅在事件加白的时候使用
     * @param ImageId 镜像id, 仅仅在事件加白的时候使用
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public DescribeAccessControlRuleDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessControlRuleDetailRequest(DescribeAccessControlRuleDetailRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

