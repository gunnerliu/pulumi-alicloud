// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetControlPoliciesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetControlPoliciesPlainArgs Empty = new GetControlPoliciesPlainArgs();

    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    @Import(name="aclAction")
    private @Nullable String aclAction;

    /**
     * @return The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     * 
     */
    public Optional<String> aclAction() {
        return Optional.ofNullable(this.aclAction);
    }

    /**
     * The unique ID of the access control policy.
     * 
     */
    @Import(name="aclUuid")
    private @Nullable String aclUuid;

    /**
     * @return The unique ID of the access control policy.
     * 
     */
    public Optional<String> aclUuid() {
        return Optional.ofNullable(this.aclUuid);
    }

    /**
     * The description of the access control policy.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The description of the access control policy.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination address defined in the access control policy.
     * 
     */
    @Import(name="destination")
    private @Nullable String destination;

    /**
     * @return The destination address defined in the access control policy.
     * 
     */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
     * 
     */
    @Import(name="direction", required=true)
    private String direction;

    /**
     * @return The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
     * 
     */
    public String direction() {
        return this.direction;
    }

    /**
     * The ip version.
     * 
     */
    @Import(name="ipVersion")
    private @Nullable String ipVersion;

    /**
     * @return The ip version.
     * 
     */
    public Optional<String> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }

    /**
     * DestPortGroupPorts. Valid values: `en`, `zh`.
     * 
     */
    @Import(name="lang")
    private @Nullable String lang;

    /**
     * @return DestPortGroupPorts. Valid values: `en`, `zh`.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
     * 
     */
    @Import(name="proto")
    private @Nullable String proto;

    /**
     * @return The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
     * 
     */
    public Optional<String> proto() {
        return Optional.ofNullable(this.proto);
    }

    /**
     * The source address defined in the access control policy.
     * 
     */
    @Import(name="source")
    private @Nullable String source;

    /**
     * @return The source address defined in the access control policy.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The source IP address of the request.
     * 
     */
    @Import(name="sourceIp")
    private @Nullable String sourceIp;

    /**
     * @return The source IP address of the request.
     * 
     */
    public Optional<String> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    private GetControlPoliciesPlainArgs() {}

    private GetControlPoliciesPlainArgs(GetControlPoliciesPlainArgs $) {
        this.aclAction = $.aclAction;
        this.aclUuid = $.aclUuid;
        this.description = $.description;
        this.destination = $.destination;
        this.direction = $.direction;
        this.ipVersion = $.ipVersion;
        this.lang = $.lang;
        this.outputFile = $.outputFile;
        this.proto = $.proto;
        this.source = $.source;
        this.sourceIp = $.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetControlPoliciesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetControlPoliciesPlainArgs $;

        public Builder() {
            $ = new GetControlPoliciesPlainArgs();
        }

        public Builder(GetControlPoliciesPlainArgs defaults) {
            $ = new GetControlPoliciesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclAction The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
         * 
         * @return builder
         * 
         */
        public Builder aclAction(@Nullable String aclAction) {
            $.aclAction = aclAction;
            return this;
        }

        /**
         * @param aclUuid The unique ID of the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder aclUuid(@Nullable String aclUuid) {
            $.aclUuid = aclUuid;
            return this;
        }

        /**
         * @param description The description of the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param destination The destination address defined in the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable String destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param direction The direction of traffic to which the access control policy applies. Valid values: `in`, `out`.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param ipVersion The ip version.
         * 
         * @return builder
         * 
         */
        public Builder ipVersion(@Nullable String ipVersion) {
            $.ipVersion = ipVersion;
            return this;
        }

        /**
         * @param lang DestPortGroupPorts. Valid values: `en`, `zh`.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable String lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param proto The protocol type of traffic to which the access control policy applies. Valid values: If `direction` is `in`, the valid value is `ANY`. If `direction` is `out`, the valid values are `ANY`, `TCP`, `UDP`, `ICMP`.
         * 
         * @return builder
         * 
         */
        public Builder proto(@Nullable String proto) {
            $.proto = proto;
            return this;
        }

        /**
         * @param source The source address defined in the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        /**
         * @param sourceIp The source IP address of the request.
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(@Nullable String sourceIp) {
            $.sourceIp = sourceIp;
            return this;
        }

        public GetControlPoliciesPlainArgs build() {
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            return $;
        }
    }

}
