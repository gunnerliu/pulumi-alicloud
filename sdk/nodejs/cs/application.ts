// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState, opts?: pulumi.CustomResourceOptions): Application {
        return new Application(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cs/application:Application';

    /**
     * Returns true if the given object is an instance of Application.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Application {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Application.__pulumiType;
    }

    public readonly blueGreen!: pulumi.Output<boolean | undefined>;
    public readonly blueGreenConfirm!: pulumi.Output<boolean | undefined>;
    public readonly clusterName!: pulumi.Output<string>;
    public /*out*/ readonly defaultDomain!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly environment!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly latestImage!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly services!: pulumi.Output<outputs.cs.ApplicationService[]>;
    public readonly template!: pulumi.Output<string>;
    public readonly version!: pulumi.Output<string | undefined>;

    /**
     * Create a Application resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationArgs | ApplicationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ApplicationState | undefined;
            inputs["blueGreen"] = state ? state.blueGreen : undefined;
            inputs["blueGreenConfirm"] = state ? state.blueGreenConfirm : undefined;
            inputs["clusterName"] = state ? state.clusterName : undefined;
            inputs["defaultDomain"] = state ? state.defaultDomain : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["environment"] = state ? state.environment : undefined;
            inputs["latestImage"] = state ? state.latestImage : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["services"] = state ? state.services : undefined;
            inputs["template"] = state ? state.template : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ApplicationArgs | undefined;
            if ((!args || args.clusterName === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.template === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'template'");
            }
            inputs["blueGreen"] = args ? args.blueGreen : undefined;
            inputs["blueGreenConfirm"] = args ? args.blueGreenConfirm : undefined;
            inputs["clusterName"] = args ? args.clusterName : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["environment"] = args ? args.environment : undefined;
            inputs["latestImage"] = args ? args.latestImage : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["template"] = args ? args.template : undefined;
            inputs["version"] = args ? args.version : undefined;
            inputs["defaultDomain"] = undefined /*out*/;
            inputs["services"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Application.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    readonly blueGreen?: pulumi.Input<boolean>;
    readonly blueGreenConfirm?: pulumi.Input<boolean>;
    readonly clusterName?: pulumi.Input<string>;
    readonly defaultDomain?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly environment?: pulumi.Input<{[key: string]: any}>;
    readonly latestImage?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly services?: pulumi.Input<pulumi.Input<inputs.cs.ApplicationService>[]>;
    readonly template?: pulumi.Input<string>;
    readonly version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    readonly blueGreen?: pulumi.Input<boolean>;
    readonly blueGreenConfirm?: pulumi.Input<boolean>;
    readonly clusterName: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly environment?: pulumi.Input<{[key: string]: any}>;
    readonly latestImage?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly template: pulumi.Input<string>;
    readonly version?: pulumi.Input<string>;
}
