// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.DbInstancePlanArgs;
import com.pulumi.alicloud.gpdb.inputs.DbInstancePlanState;
import com.pulumi.alicloud.gpdb.outputs.DbInstancePlanPlanConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a GPDB DB Instance Plan resource.
 * 
 * For information about GPDB DB Instance Plan and how to use it, see [What is DB Instance Plan](https://www.alibabacloud.com/help/en/analyticdb-for-postgresql/developer-reference/api-gpdb-2016-05-03-createdbinstanceplan).
 * 
 * &gt; **NOTE:** Available since v1.189.0.
 * 
 * ## Import
 * 
 * GPDB DB Instance Plan can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:gpdb/dbInstancePlan:DbInstancePlan example &lt;db_instance_id&gt;:&lt;plan_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:gpdb/dbInstancePlan:DbInstancePlan")
public class DbInstancePlan extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Database instance.
     * 
     */
    @Export(name="dbInstanceId", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceId;

    /**
     * @return The ID of the Database instance.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * The name of the Plan.
     * 
     */
    @Export(name="dbInstancePlanName", refs={String.class}, tree="[0]")
    private Output<String> dbInstancePlanName;

    /**
     * @return The name of the Plan.
     * 
     */
    public Output<String> dbInstancePlanName() {
        return this.dbInstancePlanName;
    }
    /**
     * The plan config. See `plan_config` below.
     * 
     */
    @Export(name="planConfigs", refs={List.class,DbInstancePlanPlanConfig.class}, tree="[0,1]")
    private Output<List<DbInstancePlanPlanConfig>> planConfigs;

    /**
     * @return The plan config. See `plan_config` below.
     * 
     */
    public Output<List<DbInstancePlanPlanConfig>> planConfigs() {
        return this.planConfigs;
    }
    /**
     * The description of the Plan.
     * 
     */
    @Export(name="planDesc", refs={String.class}, tree="[0]")
    private Output<String> planDesc;

    /**
     * @return The description of the Plan.
     * 
     */
    public Output<String> planDesc() {
        return this.planDesc;
    }
    /**
     * The end time of the Plan.
     * 
     */
    @Export(name="planEndDate", refs={String.class}, tree="[0]")
    private Output<String> planEndDate;

    /**
     * @return The end time of the Plan.
     * 
     */
    public Output<String> planEndDate() {
        return this.planEndDate;
    }
    /**
     * The ID of DB Instance Plan.
     * 
     */
    @Export(name="planId", refs={String.class}, tree="[0]")
    private Output<String> planId;

    /**
     * @return The ID of DB Instance Plan.
     * 
     */
    public Output<String> planId() {
        return this.planId;
    }
    /**
     * Plan scheduling type. Valid values: `Postpone`, `Regular`.
     * 
     */
    @Export(name="planScheduleType", refs={String.class}, tree="[0]")
    private Output<String> planScheduleType;

    /**
     * @return Plan scheduling type. Valid values: `Postpone`, `Regular`.
     * 
     */
    public Output<String> planScheduleType() {
        return this.planScheduleType;
    }
    /**
     * The start time of the Plan.
     * 
     */
    @Export(name="planStartDate", refs={String.class}, tree="[0]")
    private Output<String> planStartDate;

    /**
     * @return The start time of the Plan.
     * 
     */
    public Output<String> planStartDate() {
        return this.planStartDate;
    }
    /**
     * The type of the Plan. Valid values: `PauseResume`, `Resize`.
     * 
     */
    @Export(name="planType", refs={String.class}, tree="[0]")
    private Output<String> planType;

    /**
     * @return The type of the Plan. Valid values: `PauseResume`, `Resize`.
     * 
     */
    public Output<String> planType() {
        return this.planType;
    }
    /**
     * The Status of the Plan. Valid values: `active`, `cancel`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The Status of the Plan. Valid values: `active`, `cancel`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DbInstancePlan(String name) {
        this(name, DbInstancePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DbInstancePlan(String name, DbInstancePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DbInstancePlan(String name, DbInstancePlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/dbInstancePlan:DbInstancePlan", name, args == null ? DbInstancePlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DbInstancePlan(String name, Output<String> id, @Nullable DbInstancePlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/dbInstancePlan:DbInstancePlan", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DbInstancePlan get(String name, Output<String> id, @Nullable DbInstancePlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DbInstancePlan(name, id, state, options);
    }
}
