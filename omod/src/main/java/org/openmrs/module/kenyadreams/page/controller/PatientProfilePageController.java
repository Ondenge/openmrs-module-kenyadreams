/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyadreams.page.controller;

import org.openmrs.Patient;
import org.openmrs.Visit;
import org.openmrs.api.context.Context;
import org.openmrs.module.kenyadreams.DREAMSConstants;
import org.openmrs.module.kenyaui.annotation.AppPage;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Patient Profile page controller
 */
@AppPage(DREAMSConstants.APP_DREAMS)
public class PatientProfilePageController {
	
	public void controller(@RequestParam("patientId") Patient patient, PageModel model) {
		
		List<Visit> activeVisits = Context.getVisitService().getActiveVisitsByPatient(patient);
		
		Visit lastVisit = null;
		if (activeVisits.size() > 0) {
			lastVisit = activeVisits.get(activeVisits.size() - 1);
		}
		model.addAttribute("visit", lastVisit);
		model.addAttribute("patient", patient);
		
	}
}
