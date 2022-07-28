// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUsersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersPlainArgs Empty = new GetUsersPlainArgs();

    /**
     * A list of User IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of User IDs.
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

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetUsersPlainArgs() {}

    private GetUsersPlainArgs(GetUsersPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersPlainArgs $;

        public Builder() {
            $ = new GetUsersPlainArgs();
        }

        public Builder(GetUsersPlainArgs defaults) {
            $ = new GetUsersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of User IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of User IDs.
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

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetUsersPlainArgs build() {
            return $;
        }
    }

}
