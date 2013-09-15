/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hastybox.magpie.core.model.simple;

import java.util.Date;
import java.util.Set;

import com.hastybox.magpie.core.model.TwitterMessage;

/**
 * Simple POJO implementing {@link TwitterMessage}
 * 
 * @author psy
 *
 */
public class SimpleTwitterMessage implements TwitterMessage {
	
	private Long id;
	
	private String text;
	
	private String username;
	
	private String userScreenname;
	
	private Long userId;
	
	private Date createdAt;
	
	private Set<String> hashTags;

}
