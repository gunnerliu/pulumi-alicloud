// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGtmInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGtmInstancesPlainArgs Empty = new GetGtmInstancesPlainArgs();

    /**
     * A list of Gtm Instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Gtm Instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The lang.
     * 
     */
    @Import(name="lang")
    private @Nullable String lang;

    /**
     * @return The lang.
     * 
     */
    public Optional<String> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    private GetGtmInstancesPlainArgs() {}

    private GetGtmInstancesPlainArgs(GetGtmInstancesPlainArgs $) {
        this.ids = $.ids;
        this.lang = $.lang;
        this.resourceGroupId = $.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGtmInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGtmInstancesPlainArgs $;

        public Builder() {
            $ = new GetGtmInstancesPlainArgs();
        }

        public Builder(GetGtmInstancesPlainArgs defaults) {
            $ = new GetGtmInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Gtm Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Gtm Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param lang The lang.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable String lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        public GetGtmInstancesPlainArgs build() {
            return $;
        }
    }

}
