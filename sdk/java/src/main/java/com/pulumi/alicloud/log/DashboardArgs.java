// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardArgs Empty = new DashboardArgs();

    /**
     * Configuration of charts in the dashboard.
     * 
     */
    @Import(name="charList", required=true)
    private Output<String> charList;

    /**
     * @return Configuration of charts in the dashboard.
     * 
     */
    public Output<String> charList() {
        return this.charList;
    }

    /**
     * The name of the Log Dashboard.
     * 
     */
    @Import(name="dashboardName", required=true)
    private Output<String> dashboardName;

    /**
     * @return The name of the Log Dashboard.
     * 
     */
    public Output<String> dashboardName() {
        return this.dashboardName;
    }

    /**
     * Dashboard alias.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Dashboard alias.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the log project. It is the only in one Alicloud account.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return The name of the log project. It is the only in one Alicloud account.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    private DashboardArgs() {}

    private DashboardArgs(DashboardArgs $) {
        this.charList = $.charList;
        this.dashboardName = $.dashboardName;
        this.displayName = $.displayName;
        this.projectName = $.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardArgs $;

        public Builder() {
            $ = new DashboardArgs();
        }

        public Builder(DashboardArgs defaults) {
            $ = new DashboardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param charList Configuration of charts in the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder charList(Output<String> charList) {
            $.charList = charList;
            return this;
        }

        /**
         * @param charList Configuration of charts in the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder charList(String charList) {
            return charList(Output.of(charList));
        }

        /**
         * @param dashboardName The name of the Log Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboardName(Output<String> dashboardName) {
            $.dashboardName = dashboardName;
            return this;
        }

        /**
         * @param dashboardName The name of the Log Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder dashboardName(String dashboardName) {
            return dashboardName(Output.of(dashboardName));
        }

        /**
         * @param displayName Dashboard alias.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Dashboard alias.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param projectName The name of the log project. It is the only in one Alicloud account.
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName The name of the log project. It is the only in one Alicloud account.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public DashboardArgs build() {
            $.charList = Objects.requireNonNull($.charList, "expected parameter 'charList' to be non-null");
            $.dashboardName = Objects.requireNonNull($.dashboardName, "expected parameter 'dashboardName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            return $;
        }
    }

}
