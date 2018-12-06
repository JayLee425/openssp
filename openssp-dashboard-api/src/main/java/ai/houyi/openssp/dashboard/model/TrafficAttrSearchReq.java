/*
 * Copyright 2017 The OpenAds Project
 *
 * The OpenAds Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package ai.houyi.openssp.dashboard.model;

import org.apache.commons.lang3.StringUtils;

import ai.houyi.openssp.model.example.TrafficAttrExample;

/**
 * @author weiping wang
 *
 */
public class TrafficAttrSearchReq extends SearchReq {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrafficAttrExample toExample() {
		if (StringUtils.isNotBlank(name)) {
			return TrafficAttrExample.newAndCreateCriteria().andNameLike("%" + name + "%").example();
		}
		return null;
	}
}
