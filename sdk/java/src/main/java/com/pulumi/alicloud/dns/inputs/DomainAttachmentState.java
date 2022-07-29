// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final DomainAttachmentState Empty = new DomainAttachmentState();

    /**
     * The domain names bound to the DNS instance.
     * 
     */
    @Import(name="domainNames")
    private @Nullable Output<List<String>> domainNames;

    /**
     * @return The domain names bound to the DNS instance.
     * 
     */
    public Optional<Output<List<String>>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    /**
     * The id of the DNS instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The id of the DNS instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    private DomainAttachmentState() {}

    private DomainAttachmentState(DomainAttachmentState $) {
        this.domainNames = $.domainNames;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainAttachmentState $;

        public Builder() {
            $ = new DomainAttachmentState();
        }

        public Builder(DomainAttachmentState defaults) {
            $ = new DomainAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainNames The domain names bound to the DNS instance.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
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
        public Builder instanceId(@Nullable Output<String> instanceId) {
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

        public DomainAttachmentState build() {
            return $;
        }
    }

}
