// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource use an orchestration template to define and deploy a multi-container application. An application is created by using an orchestration template.
 * Each application can contain one or more services.
 * 
 * -> **NOTE:** Application orchestration template must be a valid Docker Compose YAML template.
 * 
 * -> **NOTE:** At present, this resource only support swarm cluster.
 */
export class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState): Application {
        return new Application(name, <any>state, { id });
    }

    /**
     * Wherther to use "Blue Green" method when release a new version. Default to false.
     */
    public readonly blueGreen: pulumi.Output<boolean | undefined>;
    /**
     * Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
     */
    public readonly blueGreenConfirm: pulumi.Output<boolean | undefined>;
    /**
     * The swarm cluster's name.
     */
    public readonly clusterName: pulumi.Output<string>;
    /**
     * The application default domain and it can be used to configure routing service.
     */
    public /*out*/ readonly defaultDomain: pulumi.Output<string>;
    /**
     * The description of application.
     */
    public readonly description: pulumi.Output<string | undefined>;
    /**
     * A key/value map used to replace the variable parameter in the Compose template.
     */
    public readonly environment: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Whether to use latest docker image while each updating application. Default to false.
     */
    public readonly latestImage: pulumi.Output<boolean | undefined>;
    /**
     * The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
     */
    public readonly name: pulumi.Output<string>;
    /**
     * List of services in the application. It contains several attributes to `Block Nodes`.
     */
    public /*out*/ readonly services: pulumi.Output<{ id: string, name: string, status: string, version: string }[]>;
    /**
     * The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
     */
    public readonly template: pulumi.Output<string>;
    /**
     * The application deploying version. Each updating, it must be different with current. Default to "1.0"
     */
    public readonly version: pulumi.Output<string | undefined>;

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
            const state: ApplicationState = argsOrState as ApplicationState | undefined;
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
            if (!args || args.clusterName === undefined) {
                throw new Error("Missing required property 'clusterName'");
            }
            if (!args || args.template === undefined) {
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
        super("alicloud:cs/application:Application", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    /**
     * Wherther to use "Blue Green" method when release a new version. Default to false.
     */
    readonly blueGreen?: pulumi.Input<boolean>;
    /**
     * Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
     */
    readonly blueGreenConfirm?: pulumi.Input<boolean>;
    /**
     * The swarm cluster's name.
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * The application default domain and it can be used to configure routing service.
     */
    readonly defaultDomain?: pulumi.Input<string>;
    /**
     * The description of application.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A key/value map used to replace the variable parameter in the Compose template.
     */
    readonly environment?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to use latest docker image while each updating application. Default to false.
     */
    readonly latestImage?: pulumi.Input<boolean>;
    /**
     * The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * List of services in the application. It contains several attributes to `Block Nodes`.
     */
    readonly services?: pulumi.Input<pulumi.Input<{ id?: pulumi.Input<string>, name?: pulumi.Input<string>, status?: pulumi.Input<string>, version?: pulumi.Input<string> }>[]>;
    /**
     * The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
     */
    readonly template?: pulumi.Input<string>;
    /**
     * The application deploying version. Each updating, it must be different with current. Default to "1.0"
     */
    readonly version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    /**
     * Wherther to use "Blue Green" method when release a new version. Default to false.
     */
    readonly blueGreen?: pulumi.Input<boolean>;
    /**
     * Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
     */
    readonly blueGreenConfirm?: pulumi.Input<boolean>;
    /**
     * The swarm cluster's name.
     */
    readonly clusterName: pulumi.Input<string>;
    /**
     * The description of application.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A key/value map used to replace the variable parameter in the Compose template.
     */
    readonly environment?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to use latest docker image while each updating application. Default to false.
     */
    readonly latestImage?: pulumi.Input<boolean>;
    /**
     * The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
     */
    readonly template: pulumi.Input<string>;
    /**
     * The application deploying version. Each updating, it must be different with current. Default to "1.0"
     */
    readonly version?: pulumi.Input<string>;
}