// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.scdn.inputs;

import com.pulumi.alicloud.scdn.inputs.DomainCertInfoArgs;
import com.pulumi.alicloud.scdn.inputs.DomainSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * Attribute perm has been deprecated and suggest removing it from your template.
     * 
     * @deprecated
     * Attribute biz_name has been deprecated and suggest removing it from your template.
     * 
     */
    @Deprecated /* Attribute biz_name has been deprecated and suggest removing it from your template. */
    @Import(name="bizName")
    private @Nullable Output<String> bizName;

    /**
     * @return Attribute perm has been deprecated and suggest removing it from your template.
     * 
     * @deprecated
     * Attribute biz_name has been deprecated and suggest removing it from your template.
     * 
     */
    @Deprecated /* Attribute biz_name has been deprecated and suggest removing it from your template. */
    public Optional<Output<String>> bizName() {
        return Optional.ofNullable(this.bizName);
    }

    /**
     * Certificate Information. See the following `Block cert_infos`.
     * 
     */
    @Import(name="certInfos")
    private @Nullable Output<List<DomainCertInfoArgs>> certInfos;

    /**
     * @return Certificate Information. See the following `Block cert_infos`.
     * 
     */
    public Optional<Output<List<DomainCertInfoArgs>>> certInfos() {
        return Optional.ofNullable(this.certInfos);
    }

    /**
     * The health check url.
     * 
     */
    @Import(name="checkUrl")
    private @Nullable Output<String> checkUrl;

    /**
     * @return The health check url.
     * 
     */
    public Optional<Output<String>> checkUrl() {
        return Optional.ofNullable(this.checkUrl);
    }

    /**
     * The name of domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The name of domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Whether to set certificate forcibly.
     * 
     */
    @Import(name="forceSet")
    private @Nullable Output<String> forceSet;

    /**
     * @return Whether to set certificate forcibly.
     * 
     */
    public Optional<Output<String>> forceSet() {
        return Optional.ofNullable(this.forceSet);
    }

    /**
     * The resource group id.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group id.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * the Origin Server Information. See the following `Block sources`.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<DomainSourceArgs>> sources;

    /**
     * @return the Origin Server Information. See the following `Block sources`.
     * 
     */
    public Optional<Output<List<DomainSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * The status of the resource. Valid values: `offline`, `online`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `offline`, `online`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.bizName = $.bizName;
        this.certInfos = $.certInfos;
        this.checkUrl = $.checkUrl;
        this.domainName = $.domainName;
        this.forceSet = $.forceSet;
        this.resourceGroupId = $.resourceGroupId;
        this.sources = $.sources;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bizName Attribute perm has been deprecated and suggest removing it from your template.
         * 
         * @return builder
         * 
         * @deprecated
         * Attribute biz_name has been deprecated and suggest removing it from your template.
         * 
         */
        @Deprecated /* Attribute biz_name has been deprecated and suggest removing it from your template. */
        public Builder bizName(@Nullable Output<String> bizName) {
            $.bizName = bizName;
            return this;
        }

        /**
         * @param bizName Attribute perm has been deprecated and suggest removing it from your template.
         * 
         * @return builder
         * 
         * @deprecated
         * Attribute biz_name has been deprecated and suggest removing it from your template.
         * 
         */
        @Deprecated /* Attribute biz_name has been deprecated and suggest removing it from your template. */
        public Builder bizName(String bizName) {
            return bizName(Output.of(bizName));
        }

        /**
         * @param certInfos Certificate Information. See the following `Block cert_infos`.
         * 
         * @return builder
         * 
         */
        public Builder certInfos(@Nullable Output<List<DomainCertInfoArgs>> certInfos) {
            $.certInfos = certInfos;
            return this;
        }

        /**
         * @param certInfos Certificate Information. See the following `Block cert_infos`.
         * 
         * @return builder
         * 
         */
        public Builder certInfos(List<DomainCertInfoArgs> certInfos) {
            return certInfos(Output.of(certInfos));
        }

        /**
         * @param certInfos Certificate Information. See the following `Block cert_infos`.
         * 
         * @return builder
         * 
         */
        public Builder certInfos(DomainCertInfoArgs... certInfos) {
            return certInfos(List.of(certInfos));
        }

        /**
         * @param checkUrl The health check url.
         * 
         * @return builder
         * 
         */
        public Builder checkUrl(@Nullable Output<String> checkUrl) {
            $.checkUrl = checkUrl;
            return this;
        }

        /**
         * @param checkUrl The health check url.
         * 
         * @return builder
         * 
         */
        public Builder checkUrl(String checkUrl) {
            return checkUrl(Output.of(checkUrl));
        }

        /**
         * @param domainName The name of domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param forceSet Whether to set certificate forcibly.
         * 
         * @return builder
         * 
         */
        public Builder forceSet(@Nullable Output<String> forceSet) {
            $.forceSet = forceSet;
            return this;
        }

        /**
         * @param forceSet Whether to set certificate forcibly.
         * 
         * @return builder
         * 
         */
        public Builder forceSet(String forceSet) {
            return forceSet(Output.of(forceSet));
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group id.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param sources the Origin Server Information. See the following `Block sources`.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<DomainSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources the Origin Server Information. See the following `Block sources`.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<DomainSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources the Origin Server Information. See the following `Block sources`.
         * 
         * @return builder
         * 
         */
        public Builder sources(DomainSourceArgs... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param status The status of the resource. Valid values: `offline`, `online`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `offline`, `online`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public DomainState build() {
            return $;
        }
    }

}
