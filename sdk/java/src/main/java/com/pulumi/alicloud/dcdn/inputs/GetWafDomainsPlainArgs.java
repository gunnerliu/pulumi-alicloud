// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWafDomainsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWafDomainsPlainArgs Empty = new GetWafDomainsPlainArgs();

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Waf Domain IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Waf Domain IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
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
     * The query conditions. You can filter domain names by name. Fuzzy match is supported `QueryArgs={&#34;DomainName&#34;:&#34;Accelerated domain name&#34;}`.
     * 
     */
    @Import(name="queryArgs")
    private @Nullable String queryArgs;

    /**
     * @return The query conditions. You can filter domain names by name. Fuzzy match is supported `QueryArgs={&#34;DomainName&#34;:&#34;Accelerated domain name&#34;}`.
     * 
     */
    public Optional<String> queryArgs() {
        return Optional.ofNullable(this.queryArgs);
    }

    private GetWafDomainsPlainArgs() {}

    private GetWafDomainsPlainArgs(GetWafDomainsPlainArgs $) {
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.queryArgs = $.queryArgs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWafDomainsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWafDomainsPlainArgs $;

        public Builder() {
            $ = new GetWafDomainsPlainArgs();
        }

        public Builder(GetWafDomainsPlainArgs defaults) {
            $ = new GetWafDomainsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Waf Domain IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Waf Domain IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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
         * @param queryArgs The query conditions. You can filter domain names by name. Fuzzy match is supported `QueryArgs={&#34;DomainName&#34;:&#34;Accelerated domain name&#34;}`.
         * 
         * @return builder
         * 
         */
        public Builder queryArgs(@Nullable String queryArgs) {
            $.queryArgs = queryArgs;
            return this;
        }

        public GetWafDomainsPlainArgs build() {
            return $;
        }
    }

}
