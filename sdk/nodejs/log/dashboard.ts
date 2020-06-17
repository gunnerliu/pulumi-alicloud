// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The dashboard is a real-time data analysis platform provided by the log service. You can display frequently used query and analysis statements in the form of charts and save statistical charts to the dashboard.
 * [Refer to details](https://www.alibabacloud.com/help/doc-detail/102530.htm).
 *
 * > **NOTE:** Available in 1.86.0
 */
export class Dashboard extends pulumi.CustomResource {
    /**
     * Get an existing Dashboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DashboardState, opts?: pulumi.CustomResourceOptions): Dashboard {
        return new Dashboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:log/dashboard:Dashboard';

    /**
     * Returns true if the given object is an instance of Dashboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Dashboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Dashboard.__pulumiType;
    }

    /**
     * Configuration of charts in the dashboard.
     */
    public readonly charList!: pulumi.Output<string>;
    /**
     * The name of the Log Dashboard.
     */
    public readonly dashboardName!: pulumi.Output<string>;
    /**
     * Dashboard alias.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    public readonly projectName!: pulumi.Output<string>;

    /**
     * Create a Dashboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DashboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DashboardArgs | DashboardState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as DashboardState | undefined;
            inputs["charList"] = state ? state.charList : undefined;
            inputs["dashboardName"] = state ? state.dashboardName : undefined;
            inputs["displayName"] = state ? state.displayName : undefined;
            inputs["projectName"] = state ? state.projectName : undefined;
        } else {
            const args = argsOrState as DashboardArgs | undefined;
            if (!args || args.charList === undefined) {
                throw new Error("Missing required property 'charList'");
            }
            if (!args || args.dashboardName === undefined) {
                throw new Error("Missing required property 'dashboardName'");
            }
            if (!args || args.projectName === undefined) {
                throw new Error("Missing required property 'projectName'");
            }
            inputs["charList"] = args ? args.charList : undefined;
            inputs["dashboardName"] = args ? args.dashboardName : undefined;
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["projectName"] = args ? args.projectName : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Dashboard.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Dashboard resources.
 */
export interface DashboardState {
    /**
     * Configuration of charts in the dashboard.
     */
    readonly charList?: pulumi.Input<string>;
    /**
     * The name of the Log Dashboard.
     */
    readonly dashboardName?: pulumi.Input<string>;
    /**
     * Dashboard alias.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    readonly projectName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Dashboard resource.
 */
export interface DashboardArgs {
    /**
     * Configuration of charts in the dashboard.
     */
    readonly charList: pulumi.Input<string>;
    /**
     * The name of the Log Dashboard.
     */
    readonly dashboardName: pulumi.Input<string>;
    /**
     * Dashboard alias.
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    readonly projectName: pulumi.Input<string>;
}