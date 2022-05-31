// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hybrid Backup Recovery (HBR) Ecs Backup Client resource.
//
// For information about Hybrid Backup Recovery (HBR) Ecs Backup Client and how to use it, see [What is Ecs Backup Client](https://www.alibabacloud.com/help/doc-detail/186570.htm).
//
// > **NOTE:** Available in v1.132.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_default, err := ecs.GetInstances(ctx, &ecs.GetInstancesArgs{
// 			NameRegex: pulumi.StringRef("ecs_instance_name"),
// 			Status:    pulumi.StringRef("Running"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hbr.NewEcsBackupClient(ctx, "example", &hbr.EcsBackupClientArgs{
// 			InstanceId:       pulumi.String(_default.Instances[0].Id),
// 			UseHttps:         pulumi.Bool(false),
// 			DataNetworkType:  pulumi.String("PUBLIC"),
// 			MaxCpuCore:       pulumi.String("2"),
// 			MaxWorker:        pulumi.String("4"),
// 			DataProxySetting: pulumi.String("USE_CONTROL_PROXY"),
// 			ProxyHost:        pulumi.String("192.168.11.101"),
// 			ProxyPort:        pulumi.String("80"),
// 			ProxyUser:        pulumi.String("user"),
// 			ProxyPassword:    pulumi.String("password"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Notice
//
// > **Note:** Please read the following precautions carefully before deleting a client:
// 1. You cannot delete active clients that have received heartbeat packets within one hour.
// 2. You can make the client inactive by change the status of client to `STOPPED`.
// 3. The resources bound to the client will be deleted in cascade, including:
//     - Backup plan
//     - Backup task (Running in the background)
//     - Snapshot
//
// ## Import
//
// Hybrid Backup Recovery (HBR) Ecs Backup Client can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:hbr/ecsBackupClient:EcsBackupClient example <id>
// ```
type EcsBackupClient struct {
	pulumi.CustomResourceState

	// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
	DataNetworkType pulumi.StringOutput `pulumi:"dataNetworkType"`
	// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
	DataProxySetting pulumi.StringOutput `pulumi:"dataProxySetting"`
	// The ID of ECS instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The number of CPU cores used by a single backup task, 0 means no restrictions.
	MaxCpuCore pulumi.StringOutput `pulumi:"maxCpuCore"`
	// The number of concurrent jobs for a single backup task, 0 means no restrictions.
	MaxWorker pulumi.StringOutput `pulumi:"maxWorker"`
	// Custom data plane proxy server host address.
	ProxyHost pulumi.StringOutput `pulumi:"proxyHost"`
	// The password of custom data plane proxy server.
	ProxyPassword pulumi.StringOutput `pulumi:"proxyPassword"`
	// Custom data plane proxy server host port.
	ProxyPort pulumi.StringOutput `pulumi:"proxyPort"`
	// The username of custom data plane proxy server.
	ProxyUser pulumi.StringOutput `pulumi:"proxyUser"`
	// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
	Status pulumi.StringOutput `pulumi:"status"`
	// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
	UseHttps pulumi.BoolOutput `pulumi:"useHttps"`
}

// NewEcsBackupClient registers a new resource with the given unique name, arguments, and options.
func NewEcsBackupClient(ctx *pulumi.Context,
	name string, args *EcsBackupClientArgs, opts ...pulumi.ResourceOption) (*EcsBackupClient, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	var resource EcsBackupClient
	err := ctx.RegisterResource("alicloud:hbr/ecsBackupClient:EcsBackupClient", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsBackupClient gets an existing EcsBackupClient resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsBackupClient(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsBackupClientState, opts ...pulumi.ResourceOption) (*EcsBackupClient, error) {
	var resource EcsBackupClient
	err := ctx.ReadResource("alicloud:hbr/ecsBackupClient:EcsBackupClient", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsBackupClient resources.
type ecsBackupClientState struct {
	// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
	DataNetworkType *string `pulumi:"dataNetworkType"`
	// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
	DataProxySetting *string `pulumi:"dataProxySetting"`
	// The ID of ECS instance.
	InstanceId *string `pulumi:"instanceId"`
	// The number of CPU cores used by a single backup task, 0 means no restrictions.
	MaxCpuCore *string `pulumi:"maxCpuCore"`
	// The number of concurrent jobs for a single backup task, 0 means no restrictions.
	MaxWorker *string `pulumi:"maxWorker"`
	// Custom data plane proxy server host address.
	ProxyHost *string `pulumi:"proxyHost"`
	// The password of custom data plane proxy server.
	ProxyPassword *string `pulumi:"proxyPassword"`
	// Custom data plane proxy server host port.
	ProxyPort *string `pulumi:"proxyPort"`
	// The username of custom data plane proxy server.
	ProxyUser *string `pulumi:"proxyUser"`
	// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
	Status *string `pulumi:"status"`
	// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
	UseHttps *bool `pulumi:"useHttps"`
}

type EcsBackupClientState struct {
	// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
	DataNetworkType pulumi.StringPtrInput
	// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
	DataProxySetting pulumi.StringPtrInput
	// The ID of ECS instance.
	InstanceId pulumi.StringPtrInput
	// The number of CPU cores used by a single backup task, 0 means no restrictions.
	MaxCpuCore pulumi.StringPtrInput
	// The number of concurrent jobs for a single backup task, 0 means no restrictions.
	MaxWorker pulumi.StringPtrInput
	// Custom data plane proxy server host address.
	ProxyHost pulumi.StringPtrInput
	// The password of custom data plane proxy server.
	ProxyPassword pulumi.StringPtrInput
	// Custom data plane proxy server host port.
	ProxyPort pulumi.StringPtrInput
	// The username of custom data plane proxy server.
	ProxyUser pulumi.StringPtrInput
	// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
	Status pulumi.StringPtrInput
	// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
	UseHttps pulumi.BoolPtrInput
}

func (EcsBackupClientState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsBackupClientState)(nil)).Elem()
}

type ecsBackupClientArgs struct {
	// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
	DataNetworkType *string `pulumi:"dataNetworkType"`
	// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
	DataProxySetting *string `pulumi:"dataProxySetting"`
	// The ID of ECS instance.
	InstanceId string `pulumi:"instanceId"`
	// The number of CPU cores used by a single backup task, 0 means no restrictions.
	MaxCpuCore *string `pulumi:"maxCpuCore"`
	// The number of concurrent jobs for a single backup task, 0 means no restrictions.
	MaxWorker *string `pulumi:"maxWorker"`
	// Custom data plane proxy server host address.
	ProxyHost *string `pulumi:"proxyHost"`
	// The password of custom data plane proxy server.
	ProxyPassword *string `pulumi:"proxyPassword"`
	// Custom data plane proxy server host port.
	ProxyPort *string `pulumi:"proxyPort"`
	// The username of custom data plane proxy server.
	ProxyUser *string `pulumi:"proxyUser"`
	// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
	Status *string `pulumi:"status"`
	// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
	UseHttps *bool `pulumi:"useHttps"`
}

// The set of arguments for constructing a EcsBackupClient resource.
type EcsBackupClientArgs struct {
	// The data plane access point type. Valid values: `CLASSIC`, `PUBLIC`, `VPC`. **NOTE:** The value of `CLASSIC` has been deprecated in v1.161.0+.
	DataNetworkType pulumi.StringPtrInput
	// The data plane proxy settings. Valid values: `CUSTOM`, `DISABLE`, `USE_CONTROL_PROXY`.
	DataProxySetting pulumi.StringPtrInput
	// The ID of ECS instance.
	InstanceId pulumi.StringInput
	// The number of CPU cores used by a single backup task, 0 means no restrictions.
	MaxCpuCore pulumi.StringPtrInput
	// The number of concurrent jobs for a single backup task, 0 means no restrictions.
	MaxWorker pulumi.StringPtrInput
	// Custom data plane proxy server host address.
	ProxyHost pulumi.StringPtrInput
	// The password of custom data plane proxy server.
	ProxyPassword pulumi.StringPtrInput
	// Custom data plane proxy server host port.
	ProxyPort pulumi.StringPtrInput
	// The username of custom data plane proxy server.
	ProxyUser pulumi.StringPtrInput
	// Status of client. Valid values: `ACTIVATED`, `STOPPED`. You can start or stop the client by specifying the status.
	Status pulumi.StringPtrInput
	// Indicates whether to use the HTTPS protocol. Valid values: `true`, `false`.
	UseHttps pulumi.BoolPtrInput
}

func (EcsBackupClientArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsBackupClientArgs)(nil)).Elem()
}

type EcsBackupClientInput interface {
	pulumi.Input

	ToEcsBackupClientOutput() EcsBackupClientOutput
	ToEcsBackupClientOutputWithContext(ctx context.Context) EcsBackupClientOutput
}

func (*EcsBackupClient) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsBackupClient)(nil)).Elem()
}

func (i *EcsBackupClient) ToEcsBackupClientOutput() EcsBackupClientOutput {
	return i.ToEcsBackupClientOutputWithContext(context.Background())
}

func (i *EcsBackupClient) ToEcsBackupClientOutputWithContext(ctx context.Context) EcsBackupClientOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsBackupClientOutput)
}

// EcsBackupClientArrayInput is an input type that accepts EcsBackupClientArray and EcsBackupClientArrayOutput values.
// You can construct a concrete instance of `EcsBackupClientArrayInput` via:
//
//          EcsBackupClientArray{ EcsBackupClientArgs{...} }
type EcsBackupClientArrayInput interface {
	pulumi.Input

	ToEcsBackupClientArrayOutput() EcsBackupClientArrayOutput
	ToEcsBackupClientArrayOutputWithContext(context.Context) EcsBackupClientArrayOutput
}

type EcsBackupClientArray []EcsBackupClientInput

func (EcsBackupClientArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsBackupClient)(nil)).Elem()
}

func (i EcsBackupClientArray) ToEcsBackupClientArrayOutput() EcsBackupClientArrayOutput {
	return i.ToEcsBackupClientArrayOutputWithContext(context.Background())
}

func (i EcsBackupClientArray) ToEcsBackupClientArrayOutputWithContext(ctx context.Context) EcsBackupClientArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsBackupClientArrayOutput)
}

// EcsBackupClientMapInput is an input type that accepts EcsBackupClientMap and EcsBackupClientMapOutput values.
// You can construct a concrete instance of `EcsBackupClientMapInput` via:
//
//          EcsBackupClientMap{ "key": EcsBackupClientArgs{...} }
type EcsBackupClientMapInput interface {
	pulumi.Input

	ToEcsBackupClientMapOutput() EcsBackupClientMapOutput
	ToEcsBackupClientMapOutputWithContext(context.Context) EcsBackupClientMapOutput
}

type EcsBackupClientMap map[string]EcsBackupClientInput

func (EcsBackupClientMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsBackupClient)(nil)).Elem()
}

func (i EcsBackupClientMap) ToEcsBackupClientMapOutput() EcsBackupClientMapOutput {
	return i.ToEcsBackupClientMapOutputWithContext(context.Background())
}

func (i EcsBackupClientMap) ToEcsBackupClientMapOutputWithContext(ctx context.Context) EcsBackupClientMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsBackupClientMapOutput)
}

type EcsBackupClientOutput struct{ *pulumi.OutputState }

func (EcsBackupClientOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsBackupClient)(nil)).Elem()
}

func (o EcsBackupClientOutput) ToEcsBackupClientOutput() EcsBackupClientOutput {
	return o
}

func (o EcsBackupClientOutput) ToEcsBackupClientOutputWithContext(ctx context.Context) EcsBackupClientOutput {
	return o
}

type EcsBackupClientArrayOutput struct{ *pulumi.OutputState }

func (EcsBackupClientArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsBackupClient)(nil)).Elem()
}

func (o EcsBackupClientArrayOutput) ToEcsBackupClientArrayOutput() EcsBackupClientArrayOutput {
	return o
}

func (o EcsBackupClientArrayOutput) ToEcsBackupClientArrayOutputWithContext(ctx context.Context) EcsBackupClientArrayOutput {
	return o
}

func (o EcsBackupClientArrayOutput) Index(i pulumi.IntInput) EcsBackupClientOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsBackupClient {
		return vs[0].([]*EcsBackupClient)[vs[1].(int)]
	}).(EcsBackupClientOutput)
}

type EcsBackupClientMapOutput struct{ *pulumi.OutputState }

func (EcsBackupClientMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsBackupClient)(nil)).Elem()
}

func (o EcsBackupClientMapOutput) ToEcsBackupClientMapOutput() EcsBackupClientMapOutput {
	return o
}

func (o EcsBackupClientMapOutput) ToEcsBackupClientMapOutputWithContext(ctx context.Context) EcsBackupClientMapOutput {
	return o
}

func (o EcsBackupClientMapOutput) MapIndex(k pulumi.StringInput) EcsBackupClientOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsBackupClient {
		return vs[0].(map[string]*EcsBackupClient)[vs[1].(string)]
	}).(EcsBackupClientOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsBackupClientInput)(nil)).Elem(), &EcsBackupClient{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsBackupClientArrayInput)(nil)).Elem(), EcsBackupClientArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsBackupClientMapInput)(nil)).Elem(), EcsBackupClientMap{})
	pulumi.RegisterOutputType(EcsBackupClientOutput{})
	pulumi.RegisterOutputType(EcsBackupClientArrayOutput{})
	pulumi.RegisterOutputType(EcsBackupClientMapOutput{})
}
