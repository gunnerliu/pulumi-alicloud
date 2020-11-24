// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gpdb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a connection resource to allocate an Internet connection string for instance.
//
// > **NOTE:**  Available in 1.48.0+
//
// > **NOTE:** Each instance will allocate a intranet connection string automatically and its prefix is instance ID.
//  To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/gpdb"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		creation := "Gpdb"
// 		if param := cfg.Get("creation"); param != "" {
// 			creation = param
// 		}
// 		name := "gpdbConnectionBasic"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := creation
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/24"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultInstance, err := gpdb.NewInstance(ctx, "defaultInstance", &gpdb.InstanceArgs{
// 			VswitchId:          defaultSwitch.ID(),
// 			Engine:             pulumi.String("gpdb"),
// 			EngineVersion:      pulumi.String("4.3"),
// 			InstanceClass:      pulumi.String("gpdb.group.segsdx2"),
// 			InstanceGroupCount: pulumi.String("2"),
// 			Description:        pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = gpdb.NewConnection(ctx, "defaultConnection", &gpdb.ConnectionArgs{
// 			InstanceId:       defaultInstance.ID(),
// 			ConnectionPrefix: pulumi.String("testAbc"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// AnalyticDB for PostgreSQL's connection can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:gpdb/connection:Connection example abc12345678
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
	ConnectionPrefix pulumi.StringOutput `pulumi:"connectionPrefix"`
	// Connection instance string.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The Id of instance that can run database.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The ip address of connection string.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// Internet connection port. Valid value: [3200-3999]. Default to 3306.
	Port pulumi.StringPtrOutput `pulumi:"port"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil || args.InstanceId == nil {
		return nil, errors.New("missing required argument 'InstanceId'")
	}
	if args == nil {
		args = &ConnectionArgs{}
	}
	var resource Connection
	err := ctx.RegisterResource("alicloud:gpdb/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("alicloud:gpdb/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
	ConnectionPrefix *string `pulumi:"connectionPrefix"`
	// Connection instance string.
	ConnectionString *string `pulumi:"connectionString"`
	// The Id of instance that can run database.
	InstanceId *string `pulumi:"instanceId"`
	// The ip address of connection string.
	IpAddress *string `pulumi:"ipAddress"`
	// Internet connection port. Valid value: [3200-3999]. Default to 3306.
	Port *string `pulumi:"port"`
}

type ConnectionState struct {
	// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
	ConnectionPrefix pulumi.StringPtrInput
	// Connection instance string.
	ConnectionString pulumi.StringPtrInput
	// The Id of instance that can run database.
	InstanceId pulumi.StringPtrInput
	// The ip address of connection string.
	IpAddress pulumi.StringPtrInput
	// Internet connection port. Valid value: [3200-3999]. Default to 3306.
	Port pulumi.StringPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
	ConnectionPrefix *string `pulumi:"connectionPrefix"`
	// The Id of instance that can run database.
	InstanceId string `pulumi:"instanceId"`
	// Internet connection port. Valid value: [3200-3999]. Default to 3306.
	Port *string `pulumi:"port"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
	ConnectionPrefix pulumi.StringPtrInput
	// The Id of instance that can run database.
	InstanceId pulumi.StringInput
	// Internet connection port. Valid value: [3200-3999]. Default to 3306.
	Port pulumi.StringPtrInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (Connection) ElementType() reflect.Type {
	return reflect.TypeOf((*Connection)(nil)).Elem()
}

func (i Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

type ConnectionOutput struct {
	*pulumi.OutputState
}

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ConnectionOutput)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ConnectionOutput{})
}
