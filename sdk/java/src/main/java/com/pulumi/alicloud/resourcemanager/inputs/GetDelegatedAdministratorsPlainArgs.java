// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDelegatedAdministratorsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDelegatedAdministratorsPlainArgs Empty = new GetDelegatedAdministratorsPlainArgs();

    /**
     * A list of Delegated Administrator IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Delegated Administrator IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The identity of the trusted service.
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable String servicePrincipal;

    /**
     * @return The identity of the trusted service.
     * 
     */
    public Optional<String> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private GetDelegatedAdministratorsPlainArgs() {}

    private GetDelegatedAdministratorsPlainArgs(GetDelegatedAdministratorsPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatedAdministratorsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatedAdministratorsPlainArgs $;

        public Builder() {
            $ = new GetDelegatedAdministratorsPlainArgs();
        }

        public Builder(GetDelegatedAdministratorsPlainArgs defaults) {
            $ = new GetDelegatedAdministratorsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Delegated Administrator IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Delegated Administrator IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param servicePrincipal The identity of the trusted service.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(@Nullable String servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        public GetDelegatedAdministratorsPlainArgs build() {
            return $;
        }
    }

}