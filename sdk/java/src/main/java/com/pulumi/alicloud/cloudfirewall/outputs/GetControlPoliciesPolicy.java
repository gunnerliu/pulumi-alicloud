// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetControlPoliciesPolicy {
    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    private String aclAction;
    /**
     * @return The unique ID of the access control policy.
     * 
     */
    private String aclUuid;
    private String applicationId;
    /**
     * @return The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * 
     */
    private String applicationName;
    /**
     * @return The description of the access control policy.
     * 
     */
    private String description;
    /**
     * @return The destination port defined in the access control policy.
     * 
     */
    private String destPort;
    /**
     * @return The destination port address book defined in the access control policy.
     * 
     */
    private String destPortGroup;
    private List<String> destPortGroupPorts;
    /**
     * @return The destination port type defined in the access control policy. Valid values: `group`, `port`.
     * 
     */
    private String destPortType;
    /**
     * @return The destination address defined in the access control policy.
     * 
     */
    private String destination;
    private List<String> destinationGroupCidrs;
    private String destinationGroupType;
    /**
     * @return The destination address type defined in the access control policy.Valid values: If `direction` is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
     * 
     */
    private String destinationType;
    /**
     * @return The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
     * 
     */
    private String direction;
    private String dnsResult;
    private String dnsResultTime;
    private String hitTimes;
    /**
     * @return The ID of the Control Policy.
     * 
     */
    private String id;
    private Integer order;
    /**
     * @return The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
     * 
     */
    private String proto;
    /**
     * @return Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
     * 
     */
    private Boolean release;
    /**
     * @return The source address defined in the access control policy.
     * 
     */
    private String source;
    private List<String> sourceGroupCidrs;
    private String sourceGroupType;
    /**
     * @return The type of the source address book defined in the access control policy. Valid values: If `direction` is to `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
     * 
     */
    private String sourceType;

    private GetControlPoliciesPolicy() {}
    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    public String aclAction() {
        return this.aclAction;
    }
    /**
     * @return The unique ID of the access control policy.
     * 
     */
    public String aclUuid() {
        return this.aclUuid;
    }
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return The application type that the access control policy supports.If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The description of the access control policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The destination port defined in the access control policy.
     * 
     */
    public String destPort() {
        return this.destPort;
    }
    /**
     * @return The destination port address book defined in the access control policy.
     * 
     */
    public String destPortGroup() {
        return this.destPortGroup;
    }
    public List<String> destPortGroupPorts() {
        return this.destPortGroupPorts;
    }
    /**
     * @return The destination port type defined in the access control policy. Valid values: `group`, `port`.
     * 
     */
    public String destPortType() {
        return this.destPortType;
    }
    /**
     * @return The destination address defined in the access control policy.
     * 
     */
    public String destination() {
        return this.destination;
    }
    public List<String> destinationGroupCidrs() {
        return this.destinationGroupCidrs;
    }
    public String destinationGroupType() {
        return this.destinationGroupType;
    }
    /**
     * @return The destination address type defined in the access control policy.Valid values: If `direction` is `in`, the valid values are `net`, `group`. If `direction` is `out`, the valid values are `net`, `group`, `domain`, `location`.
     * 
     */
    public String destinationType() {
        return this.destinationType;
    }
    /**
     * @return The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    public String dnsResult() {
        return this.dnsResult;
    }
    public String dnsResultTime() {
        return this.dnsResultTime;
    }
    public String hitTimes() {
        return this.hitTimes;
    }
    /**
     * @return The ID of the Control Policy.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer order() {
        return this.order;
    }
    /**
     * @return The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
     * 
     */
    public String proto() {
        return this.proto;
    }
    /**
     * @return Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values: `true`, `false`.
     * 
     */
    public Boolean release() {
        return this.release;
    }
    /**
     * @return The source address defined in the access control policy.
     * 
     */
    public String source() {
        return this.source;
    }
    public List<String> sourceGroupCidrs() {
        return this.sourceGroupCidrs;
    }
    public String sourceGroupType() {
        return this.sourceGroupType;
    }
    /**
     * @return The type of the source address book defined in the access control policy. Valid values: If `direction` is to `in`, the valid values are `net`, `group`, `location`. If `direction` is `out`, the valid values are `net`, `group`.
     * 
     */
    public String sourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlPoliciesPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aclAction;
        private String aclUuid;
        private String applicationId;
        private String applicationName;
        private String description;
        private String destPort;
        private String destPortGroup;
        private List<String> destPortGroupPorts;
        private String destPortType;
        private String destination;
        private List<String> destinationGroupCidrs;
        private String destinationGroupType;
        private String destinationType;
        private String direction;
        private String dnsResult;
        private String dnsResultTime;
        private String hitTimes;
        private String id;
        private Integer order;
        private String proto;
        private Boolean release;
        private String source;
        private List<String> sourceGroupCidrs;
        private String sourceGroupType;
        private String sourceType;
        public Builder() {}
        public Builder(GetControlPoliciesPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclAction = defaults.aclAction;
    	      this.aclUuid = defaults.aclUuid;
    	      this.applicationId = defaults.applicationId;
    	      this.applicationName = defaults.applicationName;
    	      this.description = defaults.description;
    	      this.destPort = defaults.destPort;
    	      this.destPortGroup = defaults.destPortGroup;
    	      this.destPortGroupPorts = defaults.destPortGroupPorts;
    	      this.destPortType = defaults.destPortType;
    	      this.destination = defaults.destination;
    	      this.destinationGroupCidrs = defaults.destinationGroupCidrs;
    	      this.destinationGroupType = defaults.destinationGroupType;
    	      this.destinationType = defaults.destinationType;
    	      this.direction = defaults.direction;
    	      this.dnsResult = defaults.dnsResult;
    	      this.dnsResultTime = defaults.dnsResultTime;
    	      this.hitTimes = defaults.hitTimes;
    	      this.id = defaults.id;
    	      this.order = defaults.order;
    	      this.proto = defaults.proto;
    	      this.release = defaults.release;
    	      this.source = defaults.source;
    	      this.sourceGroupCidrs = defaults.sourceGroupCidrs;
    	      this.sourceGroupType = defaults.sourceGroupType;
    	      this.sourceType = defaults.sourceType;
        }

        @CustomType.Setter
        public Builder aclAction(String aclAction) {
            this.aclAction = Objects.requireNonNull(aclAction);
            return this;
        }
        @CustomType.Setter
        public Builder aclUuid(String aclUuid) {
            this.aclUuid = Objects.requireNonNull(aclUuid);
            return this;
        }
        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder destPort(String destPort) {
            this.destPort = Objects.requireNonNull(destPort);
            return this;
        }
        @CustomType.Setter
        public Builder destPortGroup(String destPortGroup) {
            this.destPortGroup = Objects.requireNonNull(destPortGroup);
            return this;
        }
        @CustomType.Setter
        public Builder destPortGroupPorts(List<String> destPortGroupPorts) {
            this.destPortGroupPorts = Objects.requireNonNull(destPortGroupPorts);
            return this;
        }
        public Builder destPortGroupPorts(String... destPortGroupPorts) {
            return destPortGroupPorts(List.of(destPortGroupPorts));
        }
        @CustomType.Setter
        public Builder destPortType(String destPortType) {
            this.destPortType = Objects.requireNonNull(destPortType);
            return this;
        }
        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder destinationGroupCidrs(List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = Objects.requireNonNull(destinationGroupCidrs);
            return this;
        }
        public Builder destinationGroupCidrs(String... destinationGroupCidrs) {
            return destinationGroupCidrs(List.of(destinationGroupCidrs));
        }
        @CustomType.Setter
        public Builder destinationGroupType(String destinationGroupType) {
            this.destinationGroupType = Objects.requireNonNull(destinationGroupType);
            return this;
        }
        @CustomType.Setter
        public Builder destinationType(String destinationType) {
            this.destinationType = Objects.requireNonNull(destinationType);
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder dnsResult(String dnsResult) {
            this.dnsResult = Objects.requireNonNull(dnsResult);
            return this;
        }
        @CustomType.Setter
        public Builder dnsResultTime(String dnsResultTime) {
            this.dnsResultTime = Objects.requireNonNull(dnsResultTime);
            return this;
        }
        @CustomType.Setter
        public Builder hitTimes(String hitTimes) {
            this.hitTimes = Objects.requireNonNull(hitTimes);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        @CustomType.Setter
        public Builder proto(String proto) {
            this.proto = Objects.requireNonNull(proto);
            return this;
        }
        @CustomType.Setter
        public Builder release(Boolean release) {
            this.release = Objects.requireNonNull(release);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder sourceGroupCidrs(List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = Objects.requireNonNull(sourceGroupCidrs);
            return this;
        }
        public Builder sourceGroupCidrs(String... sourceGroupCidrs) {
            return sourceGroupCidrs(List.of(sourceGroupCidrs));
        }
        @CustomType.Setter
        public Builder sourceGroupType(String sourceGroupType) {
            this.sourceGroupType = Objects.requireNonNull(sourceGroupType);
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public GetControlPoliciesPolicy build() {
            final var o = new GetControlPoliciesPolicy();
            o.aclAction = aclAction;
            o.aclUuid = aclUuid;
            o.applicationId = applicationId;
            o.applicationName = applicationName;
            o.description = description;
            o.destPort = destPort;
            o.destPortGroup = destPortGroup;
            o.destPortGroupPorts = destPortGroupPorts;
            o.destPortType = destPortType;
            o.destination = destination;
            o.destinationGroupCidrs = destinationGroupCidrs;
            o.destinationGroupType = destinationGroupType;
            o.destinationType = destinationType;
            o.direction = direction;
            o.dnsResult = dnsResult;
            o.dnsResultTime = dnsResultTime;
            o.hitTimes = hitTimes;
            o.id = id;
            o.order = order;
            o.proto = proto;
            o.release = release;
            o.source = source;
            o.sourceGroupCidrs = sourceGroupCidrs;
            o.sourceGroupType = sourceGroupType;
            o.sourceType = sourceType;
            return o;
        }
    }
}