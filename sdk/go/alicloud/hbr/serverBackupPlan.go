// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Hybrid Backup Recovery (HBR) Server Backup Plan resource.
//
// For information about Hybrid Backup Recovery (HBR) Server Backup Plan and how to use it, see [What is Server Backup Plan](https://www.alibabacloud.com/help/doc-detail/211140.htm).
//
// > **NOTE:** Available in v1.142.0+.
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
// 		opt0 := "no-deleteing-hbr-ecs-server-backup-plan"
// 		opt1 := "Running"
// 		_default, err := ecs.GetInstances(ctx, &ecs.GetInstancesArgs{
// 			NameRegex: &opt0,
// 			Status:    &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = hbr.NewServerBackupPlan(ctx, "example", &hbr.ServerBackupPlanArgs{
// 			EcsServerBackupPlanName: pulumi.String("server_backup_plan"),
// 			InstanceId:              pulumi.String(_default.Instances[0].Id),
// 			Schedule:                pulumi.String("I|1602673264|PT2H"),
// 			Retention:               pulumi.Int(1),
// 			Details: hbr.ServerBackupPlanDetailArray{
// 				&hbr.ServerBackupPlanDetailArgs{
// 					AppConsistent: pulumi.Bool(true),
// 					SnapshotGroup: pulumi.Bool(true),
// 				},
// 			},
// 			Disabled: pulumi.Bool(false),
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
// Hybrid Backup Recovery (HBR) Server Backup Plan can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:hbr/serverBackupPlan:ServerBackupPlan example <id>
// ```
type ServerBackupPlan struct {
	pulumi.CustomResourceState

	// ECS server backup plan details.
	Details ServerBackupPlanDetailArrayOutput `pulumi:"details"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolOutput `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsServerBackupPlanName pulumi.StringOutput `pulumi:"ecsServerBackupPlanName"`
	// The ID of ECS instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Backup retention days, the minimum is 1.
	Retention pulumi.IntOutput `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`
	Schedule pulumi.StringOutput `pulumi:"schedule"`
}

// NewServerBackupPlan registers a new resource with the given unique name, arguments, and options.
func NewServerBackupPlan(ctx *pulumi.Context,
	name string, args *ServerBackupPlanArgs, opts ...pulumi.ResourceOption) (*ServerBackupPlan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Details == nil {
		return nil, errors.New("invalid value for required argument 'Details'")
	}
	if args.EcsServerBackupPlanName == nil {
		return nil, errors.New("invalid value for required argument 'EcsServerBackupPlanName'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Retention == nil {
		return nil, errors.New("invalid value for required argument 'Retention'")
	}
	if args.Schedule == nil {
		return nil, errors.New("invalid value for required argument 'Schedule'")
	}
	var resource ServerBackupPlan
	err := ctx.RegisterResource("alicloud:hbr/serverBackupPlan:ServerBackupPlan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerBackupPlan gets an existing ServerBackupPlan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerBackupPlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerBackupPlanState, opts ...pulumi.ResourceOption) (*ServerBackupPlan, error) {
	var resource ServerBackupPlan
	err := ctx.ReadResource("alicloud:hbr/serverBackupPlan:ServerBackupPlan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerBackupPlan resources.
type serverBackupPlanState struct {
	// ECS server backup plan details.
	Details []ServerBackupPlanDetail `pulumi:"details"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled *bool `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsServerBackupPlanName *string `pulumi:"ecsServerBackupPlanName"`
	// The ID of ECS instance.
	InstanceId *string `pulumi:"instanceId"`
	// Backup retention days, the minimum is 1.
	Retention *int `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`
	Schedule *string `pulumi:"schedule"`
}

type ServerBackupPlanState struct {
	// ECS server backup plan details.
	Details ServerBackupPlanDetailArrayInput
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolPtrInput
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsServerBackupPlanName pulumi.StringPtrInput
	// The ID of ECS instance.
	InstanceId pulumi.StringPtrInput
	// Backup retention days, the minimum is 1.
	Retention pulumi.IntPtrInput
	// Backup strategy. Optional format: `I|{startTime}|{interval}`
	Schedule pulumi.StringPtrInput
}

func (ServerBackupPlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverBackupPlanState)(nil)).Elem()
}

type serverBackupPlanArgs struct {
	// ECS server backup plan details.
	Details []ServerBackupPlanDetail `pulumi:"details"`
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled *bool `pulumi:"disabled"`
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsServerBackupPlanName string `pulumi:"ecsServerBackupPlanName"`
	// The ID of ECS instance.
	InstanceId string `pulumi:"instanceId"`
	// Backup retention days, the minimum is 1.
	Retention int `pulumi:"retention"`
	// Backup strategy. Optional format: `I|{startTime}|{interval}`
	Schedule string `pulumi:"schedule"`
}

// The set of arguments for constructing a ServerBackupPlan resource.
type ServerBackupPlanArgs struct {
	// ECS server backup plan details.
	Details ServerBackupPlanDetailArrayInput
	// Whether to disable the backup task. Valid values: `true`, `false`.
	Disabled pulumi.BoolPtrInput
	// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
	EcsServerBackupPlanName pulumi.StringInput
	// The ID of ECS instance.
	InstanceId pulumi.StringInput
	// Backup retention days, the minimum is 1.
	Retention pulumi.IntInput
	// Backup strategy. Optional format: `I|{startTime}|{interval}`
	Schedule pulumi.StringInput
}

func (ServerBackupPlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverBackupPlanArgs)(nil)).Elem()
}

type ServerBackupPlanInput interface {
	pulumi.Input

	ToServerBackupPlanOutput() ServerBackupPlanOutput
	ToServerBackupPlanOutputWithContext(ctx context.Context) ServerBackupPlanOutput
}

func (*ServerBackupPlan) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerBackupPlan)(nil)).Elem()
}

func (i *ServerBackupPlan) ToServerBackupPlanOutput() ServerBackupPlanOutput {
	return i.ToServerBackupPlanOutputWithContext(context.Background())
}

func (i *ServerBackupPlan) ToServerBackupPlanOutputWithContext(ctx context.Context) ServerBackupPlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerBackupPlanOutput)
}

// ServerBackupPlanArrayInput is an input type that accepts ServerBackupPlanArray and ServerBackupPlanArrayOutput values.
// You can construct a concrete instance of `ServerBackupPlanArrayInput` via:
//
//          ServerBackupPlanArray{ ServerBackupPlanArgs{...} }
type ServerBackupPlanArrayInput interface {
	pulumi.Input

	ToServerBackupPlanArrayOutput() ServerBackupPlanArrayOutput
	ToServerBackupPlanArrayOutputWithContext(context.Context) ServerBackupPlanArrayOutput
}

type ServerBackupPlanArray []ServerBackupPlanInput

func (ServerBackupPlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerBackupPlan)(nil)).Elem()
}

func (i ServerBackupPlanArray) ToServerBackupPlanArrayOutput() ServerBackupPlanArrayOutput {
	return i.ToServerBackupPlanArrayOutputWithContext(context.Background())
}

func (i ServerBackupPlanArray) ToServerBackupPlanArrayOutputWithContext(ctx context.Context) ServerBackupPlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerBackupPlanArrayOutput)
}

// ServerBackupPlanMapInput is an input type that accepts ServerBackupPlanMap and ServerBackupPlanMapOutput values.
// You can construct a concrete instance of `ServerBackupPlanMapInput` via:
//
//          ServerBackupPlanMap{ "key": ServerBackupPlanArgs{...} }
type ServerBackupPlanMapInput interface {
	pulumi.Input

	ToServerBackupPlanMapOutput() ServerBackupPlanMapOutput
	ToServerBackupPlanMapOutputWithContext(context.Context) ServerBackupPlanMapOutput
}

type ServerBackupPlanMap map[string]ServerBackupPlanInput

func (ServerBackupPlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerBackupPlan)(nil)).Elem()
}

func (i ServerBackupPlanMap) ToServerBackupPlanMapOutput() ServerBackupPlanMapOutput {
	return i.ToServerBackupPlanMapOutputWithContext(context.Background())
}

func (i ServerBackupPlanMap) ToServerBackupPlanMapOutputWithContext(ctx context.Context) ServerBackupPlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerBackupPlanMapOutput)
}

type ServerBackupPlanOutput struct{ *pulumi.OutputState }

func (ServerBackupPlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerBackupPlan)(nil)).Elem()
}

func (o ServerBackupPlanOutput) ToServerBackupPlanOutput() ServerBackupPlanOutput {
	return o
}

func (o ServerBackupPlanOutput) ToServerBackupPlanOutputWithContext(ctx context.Context) ServerBackupPlanOutput {
	return o
}

type ServerBackupPlanArrayOutput struct{ *pulumi.OutputState }

func (ServerBackupPlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerBackupPlan)(nil)).Elem()
}

func (o ServerBackupPlanArrayOutput) ToServerBackupPlanArrayOutput() ServerBackupPlanArrayOutput {
	return o
}

func (o ServerBackupPlanArrayOutput) ToServerBackupPlanArrayOutputWithContext(ctx context.Context) ServerBackupPlanArrayOutput {
	return o
}

func (o ServerBackupPlanArrayOutput) Index(i pulumi.IntInput) ServerBackupPlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerBackupPlan {
		return vs[0].([]*ServerBackupPlan)[vs[1].(int)]
	}).(ServerBackupPlanOutput)
}

type ServerBackupPlanMapOutput struct{ *pulumi.OutputState }

func (ServerBackupPlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerBackupPlan)(nil)).Elem()
}

func (o ServerBackupPlanMapOutput) ToServerBackupPlanMapOutput() ServerBackupPlanMapOutput {
	return o
}

func (o ServerBackupPlanMapOutput) ToServerBackupPlanMapOutputWithContext(ctx context.Context) ServerBackupPlanMapOutput {
	return o
}

func (o ServerBackupPlanMapOutput) MapIndex(k pulumi.StringInput) ServerBackupPlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerBackupPlan {
		return vs[0].(map[string]*ServerBackupPlan)[vs[1].(string)]
	}).(ServerBackupPlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerBackupPlanInput)(nil)).Elem(), &ServerBackupPlan{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerBackupPlanArrayInput)(nil)).Elem(), ServerBackupPlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerBackupPlanMapInput)(nil)).Elem(), ServerBackupPlanMap{})
	pulumi.RegisterOutputType(ServerBackupPlanOutput{})
	pulumi.RegisterOutputType(ServerBackupPlanArrayOutput{})
	pulumi.RegisterOutputType(ServerBackupPlanMapOutput{})
}
