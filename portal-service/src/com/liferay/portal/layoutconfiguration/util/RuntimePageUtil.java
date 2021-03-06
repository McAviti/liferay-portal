/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.layoutconfiguration.util;

import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.layoutconfiguration.util.xml.RuntimeLogic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Brian Wing Shun Chan
 * @author Raymond Augé
 * @author Shuyang Zhou
 */
public class RuntimePageUtil {

	public static StringBundler getProcessedTemplate(
			HttpServletRequest request, HttpServletResponse response,
			String portletId, TemplateResource templateResource)
		throws Exception {

		return getRuntimePage().getProcessedTemplate(
			request, response, portletId, templateResource);
	}

	public static RuntimePage getRuntimePage() {
		PortalRuntimePermission.checkGetBeanProperty(RuntimePageUtil.class);

		return _runtimePage;
	}

	public static void processCustomizationSettings(
			HttpServletRequest request, HttpServletResponse response,
			TemplateResource templateResource)
		throws Exception {

		getRuntimePage().processCustomizationSettings(
			request, response, templateResource);
	}

	public static void processTemplate(
			HttpServletRequest request, HttpServletResponse response,
			String portletId, TemplateResource templateResource)
		throws Exception {

		getRuntimePage().processTemplate(
			request, response, portletId, templateResource);
	}

	public static void processTemplate(
			HttpServletRequest request, HttpServletResponse response,
			TemplateResource templateResource)
		throws Exception {

		getRuntimePage().processTemplate(request, response, templateResource);
	}

	public static String processXML(
			HttpServletRequest request, HttpServletResponse response,
			String content)
		throws Exception {

		return getRuntimePage().processXML(request, response, content);
	}

	public static String processXML(
			HttpServletRequest request, String content,
			RuntimeLogic runtimeLogic)
		throws Exception {

		return getRuntimePage().processXML(request, content, runtimeLogic);
	}

	public void setRuntimePage(RuntimePage runtimePage) {
		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_runtimePage = runtimePage;
	}

	private static RuntimePage _runtimePage;

}