/**
 * 
 */
package org.fusesource.restygwt.client.codec;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

@JsonTypeInfo(use=Id.CLASS, include=As.WRAPPER_OBJECT)
@JsonSubTypes(value={@Type(SubCredentialsWithWrapperObject.class), @Type(CredentialsWithWrapperObject.class)}) 
class CredentialsWithWrapperObject {

    String password;
    
    String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}