/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;

import java.util.List;

/**
 * The persistence utility for the d d m template service. This utility wraps {@link DDMTemplatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMTemplatePersistence
 * @see DDMTemplatePersistenceImpl
 * @generated
 */
public class DDMTemplateUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DDMTemplate ddmTemplate) {
		getPersistence().clearCache(ddmTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DDMTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DDMTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DDMTemplate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static DDMTemplate remove(DDMTemplate ddmTemplate)
		throws SystemException {
		return getPersistence().remove(ddmTemplate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static DDMTemplate update(DDMTemplate ddmTemplate, boolean merge)
		throws SystemException {
		return getPersistence().update(ddmTemplate, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static DDMTemplate update(DDMTemplate ddmTemplate, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(ddmTemplate, merge, serviceContext);
	}

	/**
	* Caches the d d m template in the entity cache if it is enabled.
	*
	* @param ddmTemplate the d d m template to cache
	*/
	public static void cacheResult(
		com.liferay.portlet.dynamicdatamapping.model.DDMTemplate ddmTemplate) {
		getPersistence().cacheResult(ddmTemplate);
	}

	/**
	* Caches the d d m templates in the entity cache if it is enabled.
	*
	* @param ddmTemplates the d d m templates to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> ddmTemplates) {
		getPersistence().cacheResult(ddmTemplates);
	}

	/**
	* Creates a new d d m template with the primary key. Does not add the d d m template to the database.
	*
	* @param templateId the primary key for the new d d m template
	* @return the new d d m template
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate create(
		long templateId) {
		return getPersistence().create(templateId);
	}

	/**
	* Removes the d d m template with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param templateId the primary key of the d d m template to remove
	* @return the d d m template that was removed
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate remove(
		long templateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().remove(templateId);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate updateImpl(
		com.liferay.portlet.dynamicdatamapping.model.DDMTemplate ddmTemplate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(ddmTemplate, merge);
	}

	/**
	* Finds the d d m template with the primary key or throws a {@link com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException} if it could not be found.
	*
	* @param templateId the primary key of the d d m template to find
	* @return the d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByPrimaryKey(
		long templateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByPrimaryKey(templateId);
	}

	/**
	* Finds the d d m template with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param templateId the primary key of the d d m template to find
	* @return the d d m template, or <code>null</code> if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate fetchByPrimaryKey(
		long templateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(templateId);
	}

	/**
	* Finds all the d d m templates where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the d d m templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @return the range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the d d m templates where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first d d m template in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last d d m template in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the d d m templates before and after the current d d m template in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param templateId the primary key of the current d d m template
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate[] findByUuid_PrevAndNext(
		long templateId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByUuid_PrevAndNext(templateId, uuid, orderByComparator);
	}

	/**
	* Finds the d d m template where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Finds the d d m template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching d d m template, or <code>null</code> if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Finds the d d m template where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the matching d d m template, or <code>null</code> if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Finds all the d d m templates where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the d d m templates where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @return the range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the d d m templates where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first d d m template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last d d m template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the d d m templates before and after the current d d m template in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param templateId the primary key of the current d d m template
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate[] findByGroupId_PrevAndNext(
		long templateId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(templateId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the d d m templates where structureId = &#63;.
	*
	* @param structureId the structure ID to search with
	* @return the matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByStructureId(
		long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStructureId(structureId);
	}

	/**
	* Finds a range of all the d d m templates where structureId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param structureId the structure ID to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @return the range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByStructureId(
		long structureId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStructureId(structureId, start, end);
	}

	/**
	* Finds an ordered range of all the d d m templates where structureId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param structureId the structure ID to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByStructureId(
		long structureId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStructureId(structureId, start, end, orderByComparator);
	}

	/**
	* Finds the first d d m template in the ordered set where structureId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param structureId the structure ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByStructureId_First(
		long structureId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByStructureId_First(structureId, orderByComparator);
	}

	/**
	* Finds the last d d m template in the ordered set where structureId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param structureId the structure ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByStructureId_Last(
		long structureId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByStructureId_Last(structureId, orderByComparator);
	}

	/**
	* Finds the d d m templates before and after the current d d m template in the ordered set where structureId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param templateId the primary key of the current d d m template
	* @param structureId the structure ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate[] findByStructureId_PrevAndNext(
		long templateId, long structureId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByStructureId_PrevAndNext(templateId, structureId,
			orderByComparator);
	}

	/**
	* Finds all the d d m templates where type = &#63;.
	*
	* @param type the type to search with
	* @return the matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByType(
		java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type);
	}

	/**
	* Finds a range of all the d d m templates where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @return the range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByType(
		java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type, start, end);
	}

	/**
	* Finds an ordered range of all the d d m templates where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByType(
		java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(type, start, end, orderByComparator);
	}

	/**
	* Finds the first d d m template in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByType_First(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByType_First(type, orderByComparator);
	}

	/**
	* Finds the last d d m template in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByType_Last(
		java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByType_Last(type, orderByComparator);
	}

	/**
	* Finds the d d m templates before and after the current d d m template in the ordered set where type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param templateId the primary key of the current d d m template
	* @param type the type to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate[] findByType_PrevAndNext(
		long templateId, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByType_PrevAndNext(templateId, type, orderByComparator);
	}

	/**
	* Finds all the d d m templates where language = &#63;.
	*
	* @param language the language to search with
	* @return the matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByLanguage(
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLanguage(language);
	}

	/**
	* Finds a range of all the d d m templates where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @return the range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByLanguage(
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLanguage(language, start, end);
	}

	/**
	* Finds an ordered range of all the d d m templates where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findByLanguage(
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLanguage(language, start, end, orderByComparator);
	}

	/**
	* Finds the first d d m template in the ordered set where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByLanguage_First(
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByLanguage_First(language, orderByComparator);
	}

	/**
	* Finds the last d d m template in the ordered set where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a matching d d m template could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate findByLanguage_Last(
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence().findByLanguage_Last(language, orderByComparator);
	}

	/**
	* Finds the d d m templates before and after the current d d m template in the ordered set where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param templateId the primary key of the current d d m template
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next d d m template
	* @throws com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException if a d d m template with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMTemplate[] findByLanguage_PrevAndNext(
		long templateId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		return getPersistence()
				   .findByLanguage_PrevAndNext(templateId, language,
			orderByComparator);
	}

	/**
	* Finds all the d d m templates.
	*
	* @return the d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the d d m templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @return the range of d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the d d m templates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d m templates to return
	* @param end the upper bound of the range of d d m templates to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMTemplate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the d d m templates where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes the d d m template where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portlet.dynamicdatamapping.NoSuchTemplateException {
		getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Removes all the d d m templates where groupId = &#63; from the database.
	*
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the d d m templates where structureId = &#63; from the database.
	*
	* @param structureId the structure ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStructureId(long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStructureId(structureId);
	}

	/**
	* Removes all the d d m templates where type = &#63; from the database.
	*
	* @param type the type to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByType(type);
	}

	/**
	* Removes all the d d m templates where language = &#63; from the database.
	*
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLanguage(java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLanguage(language);
	}

	/**
	* Removes all the d d m templates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the d d m templates where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the d d m templates where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group ID to search with
	* @return the number of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Counts all the d d m templates where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the number of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the d d m templates where structureId = &#63;.
	*
	* @param structureId the structure ID to search with
	* @return the number of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStructureId(long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStructureId(structureId);
	}

	/**
	* Counts all the d d m templates where type = &#63;.
	*
	* @param type the type to search with
	* @return the number of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByType(java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByType(type);
	}

	/**
	* Counts all the d d m templates where language = &#63;.
	*
	* @param language the language to search with
	* @return the number of matching d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLanguage(java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLanguage(language);
	}

	/**
	* Counts all the d d m templates.
	*
	* @return the number of d d m templates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DDMTemplatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DDMTemplatePersistence)PortalBeanLocatorUtil.locate(DDMTemplatePersistence.class.getName());

			ReferenceRegistry.registerReference(DDMTemplateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(DDMTemplatePersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(DDMTemplateUtil.class,
			"_persistence");
	}

	private static DDMTemplatePersistence _persistence;
}