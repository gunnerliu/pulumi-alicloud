// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AlidnsDomainAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlidnsDomainAttachmentArgs Empty = new AlidnsDomainAttachmentArgs();

    /**
     * The domain names bound to the DNS instance.
     * 
     */
    @Import(name="domainNames", required=true)
    private Output<List<String>> domainNames;

    /**
     * @return The domain names bound to the DNS instance.
     * 
     */
    public Output<List<String>> domainNames() {
        return this.domainNames;
    }

    /**
     * The id of the DNS instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The id of the DNS instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    private AlidnsDomainAttachmentArgs() {}

    private AlidnsDomainAttachmentArgs(AlidnsDomainAttachmentArgs $) {
        this.domainNames = $.domainNames;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlidnsDomainAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlidnsDomainAttachmentArgs $;

        public Builder() {
            $ = new AlidnsDomainAttachmentArgs();
        }

        public Builder(AlidnsDomainAttachmentArgs defaults) {
            $ = new AlidnsDomainAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainNames The domain names bound to the DNS instance.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        /**
         * @param domainNames The domain names bound to the DNS instance.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        /**
         * @param domainNames The domain names bound to the DNS instance.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        /**
         * @param instanceId The id of the DNS instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The id of the DNS instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public AlidnsDomainAttachmentArgs build() {
            $.domainNames = Objects.requireNonNull($.domainNames, "expected parameter 'domainNames' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
