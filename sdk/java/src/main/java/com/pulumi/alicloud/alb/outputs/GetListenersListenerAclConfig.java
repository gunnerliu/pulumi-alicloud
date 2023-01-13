// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetListenersListenerAclConfigAclRelation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetListenersListenerAclConfig {
    /**
     * @return The ACLs that are associated with the listener.
     * 
     */
    private List<GetListenersListenerAclConfigAclRelation> aclRelations;
    /**
     * @return The type of the ACL. Valid values: `White` Or `Black`. `White`: specifies the ACL as a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios where only specific IP addresses are allowed to access an application. Risks may occur if the whitelist is improperly set. After you set a whitelist for an Application Load Balancer (ALB) listener, only requests from IP addresses that are added to the whitelist are distributed by the listener. If the whitelist is enabled without IP addresses specified, the ALB listener does not forward requests. `Black`: All requests from the IP addresses or CIDR blocks in the ACL are denied. The blacklist is used to prevent specified IP addresses from accessing an application. If the blacklist is enabled but the corresponding ACL does not contain IP addresses, the ALB listener forwards all requests.
     * 
     */
    private String aclType;

    private GetListenersListenerAclConfig() {}
    /**
     * @return The ACLs that are associated with the listener.
     * 
     */
    public List<GetListenersListenerAclConfigAclRelation> aclRelations() {
        return this.aclRelations;
    }
    /**
     * @return The type of the ACL. Valid values: `White` Or `Black`. `White`: specifies the ACL as a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios where only specific IP addresses are allowed to access an application. Risks may occur if the whitelist is improperly set. After you set a whitelist for an Application Load Balancer (ALB) listener, only requests from IP addresses that are added to the whitelist are distributed by the listener. If the whitelist is enabled without IP addresses specified, the ALB listener does not forward requests. `Black`: All requests from the IP addresses or CIDR blocks in the ACL are denied. The blacklist is used to prevent specified IP addresses from accessing an application. If the blacklist is enabled but the corresponding ACL does not contain IP addresses, the ALB listener forwards all requests.
     * 
     */
    public String aclType() {
        return this.aclType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersListenerAclConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetListenersListenerAclConfigAclRelation> aclRelations;
        private String aclType;
        public Builder() {}
        public Builder(GetListenersListenerAclConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclRelations = defaults.aclRelations;
    	      this.aclType = defaults.aclType;
        }

        @CustomType.Setter
        public Builder aclRelations(List<GetListenersListenerAclConfigAclRelation> aclRelations) {
            this.aclRelations = Objects.requireNonNull(aclRelations);
            return this;
        }
        public Builder aclRelations(GetListenersListenerAclConfigAclRelation... aclRelations) {
            return aclRelations(List.of(aclRelations));
        }
        @CustomType.Setter
        public Builder aclType(String aclType) {
            this.aclType = Objects.requireNonNull(aclType);
            return this;
        }
        public GetListenersListenerAclConfig build() {
            final var o = new GetListenersListenerAclConfig();
            o.aclRelations = aclRelations;
            o.aclType = aclType;
            return o;
        }
    }
}
