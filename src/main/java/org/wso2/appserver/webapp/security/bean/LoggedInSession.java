/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.appserver.webapp.security.bean;

import org.opensaml.saml.saml2.core.Assertion;
import org.opensaml.saml.saml2.core.Response;

import java.util.Map;

/**
 * A Java bean class which represents a user logged-in session.
 *
 * @since 6.0.0
 */
public class LoggedInSession {
    private SAML2SSO saml2SSO;

    public SAML2SSO getSAML2SSO() {
        return saml2SSO;
    }

    public void setSAML2SSO(SAML2SSO saml2SSO) {
        this.saml2SSO = saml2SSO;
    }

    /**
     * A static nested class which represents the SAML 2.0 specific single-sign-on (SSO) details to be held
     * in a user logged-in session.
     */
    public static class SAML2SSO {
        private String subjectId;
        private Response response;
        private String responseString;
        private Assertion assertion;
        private String assertionString;
        private String sessionIndex;
        private Map subjectAttributes;

        public String getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(String subjectId) {
            this.subjectId = subjectId;
        }

        public Map getSubjectAttributes() {
            return subjectAttributes;
        }

        public void setSubjectAttributes(Map<String, String> samlSSOAttributes) {
            this.subjectAttributes = samlSSOAttributes;
        }

        public String getSessionIndex() {
            return sessionIndex;
        }

        public void setSessionIndex(String sessionIndex) {
            this.sessionIndex = sessionIndex;
        }

        public Response getResponse() {
            return response;
        }

        public void setSAMLResponse(Response samlResponse) {
            this.response = samlResponse;
        }

        public String getResponseString() {
            return responseString;
        }

        public void setResponseString(String responseString) {
            this.responseString = responseString;
        }

        public Assertion getAssertion() {
            return assertion;
        }

        public void setAssertion(Assertion samlAssertion) {
            this.assertion = samlAssertion;
        }

        public void setAssertionString(String samlAssertionString) {
            this.assertionString = samlAssertionString;
        }

        public String getAssertionString() {
            return assertionString;
        }
    }
}
